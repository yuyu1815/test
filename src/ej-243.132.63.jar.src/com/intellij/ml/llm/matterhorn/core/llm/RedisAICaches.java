/*     */ package com.intellij.ml.llm.matterhorn.core.llm;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.configuration.BuildConfigKt;
/*     */ import com.intellij.ml.llm.matterhorn.configuration.EnvExtensionsKt;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService;
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import com.intellij.ml.llm.matterhorn.utils.HashUtilsKt;
/*     */ import com.intellij.ml.llm.matterhorn.utils.JsonUtilsKt;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import io.lettuce.core.RedisClient;
/*     */ import io.lettuce.core.RedisURI;
/*     */ import io.lettuce.core.api.StatefulRedisConnection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonBuilder;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonElementKt;
/*     */ import kotlinx.serialization.json.JsonKt;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\030\000 \0312\0020\001:\001\031B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J<\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\034\020\022\032\030\b\001\022\n\022\b\022\004\022\0020\r0\024\022\006\022\004\030\0010\0250\023H@¢\006\002\020\026J\006\020\027\032\0020\030R\016\020\006\032\0020\007X\004¢\006\002\n\000R\036\020\b\032\022\022\006\022\004\030\0010\003\022\006\022\004\030\0010\0030\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches;", "Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;", "addr", "", "<init>", "(Ljava/lang/String;)V", "client", "Lio/lettuce/core/RedisClient;", "connection", "Lio/lettuce/core/api/StatefulRedisConnection;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "lookupOrBuild", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "builder", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "", "Companion", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nAICaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICaches.kt\ncom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,219:1\n14#2:220\n14#2:223\n222#3:221\n205#3:222\n*S KotlinDebug\n*F\n+ 1 AICaches.kt\ncom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches\n*L\n123#1:220\n138#1:223\n127#1:221\n134#1:222\n*E\n"})
/*     */ public final class RedisAICaches
/*     */   implements AICache
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final RedisClient client;
/*     */   @NotNull
/*     */   private final StatefulRedisConnection<String, String> connection;
/*     */   @NotNull
/*     */   private final MatterhornPropertyProvider propertyProvider;
/*     */   
/*     */   public RedisAICaches(@NotNull String addr) {
/*  96 */     this.propertyProvider = (MatterhornPropertyProvider)MatterhornSettingsService.Companion.getInstance();
/*     */ 
/*     */     
/*  99 */     EnvExtensionsKt.assertHasRedisCache(BuildConfigKt.getConfig());
/* 100 */     boolean withSsl = !Intrinsics.areEqual(System.getenv("MATTERHORN_REDIS_WITHOUT_SSL"), "true");
/* 101 */     String[] arrayOfString = new String[1]; arrayOfString[0] = ":"; List<String> urlAndPort = StringsKt.split$default(addr, arrayOfString, false, 0, 6, null);
/* 102 */     RedisURI redisUri = RedisURI.builder()
/* 103 */       .withHost(urlAndPort.get(0))
/* 104 */       .withPort(Integer.parseInt(urlAndPort.get(1)))
/* 105 */       .withSsl(withSsl)
/* 106 */       .build();
/* 107 */     this.client = RedisClient.create(redisUri);
/* 108 */     Intrinsics.checkNotNull(this.client.connect()); this.connection = this.client.connect();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object lookupOrBuild(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull Function1 builder, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/core/llm/RedisAICaches$lookupOrBuild$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/core/llm/RedisAICaches$lookupOrBuild$1
/*     */     //   13: astore #14
/*     */     //   15: aload #14
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #14
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/core/llm/RedisAICaches$lookupOrBuild$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #14
/*     */     //   53: aload #14
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #13
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #15
/*     */     //   65: aload #14
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 620, 0 -> 100, 1 -> 187, 2 -> 393, 3 -> 487
/*     */     //   100: aload #13
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: getstatic com/intellij/ml/llm/matterhorn/core/llm/RedisAICaches.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches$Companion;
/*     */     //   108: aload_1
/*     */     //   109: aload_2
/*     */     //   110: invokevirtual getQueryHash : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)Ljava/lang/String;
/*     */     //   113: astore #5
/*     */     //   115: aload_0
/*     */     //   116: getfield connection : Lio/lettuce/core/api/StatefulRedisConnection;
/*     */     //   119: invokeinterface sync : ()Lio/lettuce/core/api/sync/RedisCommands;
/*     */     //   124: astore #6
/*     */     //   126: aconst_null
/*     */     //   127: astore #7
/*     */     //   129: aload_0
/*     */     //   130: getfield propertyProvider : Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   133: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
/*     */     //   136: invokevirtual getMATTERHORN_CAN_READ_FROM_REDIS : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   139: aload #14
/*     */     //   141: aload #14
/*     */     //   143: aload_0
/*     */     //   144: putfield L$0 : Ljava/lang/Object;
/*     */     //   147: aload #14
/*     */     //   149: aload_3
/*     */     //   150: putfield L$1 : Ljava/lang/Object;
/*     */     //   153: aload #14
/*     */     //   155: aload #5
/*     */     //   157: putfield L$2 : Ljava/lang/Object;
/*     */     //   160: aload #14
/*     */     //   162: aload #6
/*     */     //   164: putfield L$3 : Ljava/lang/Object;
/*     */     //   167: aload #14
/*     */     //   169: iconst_1
/*     */     //   170: putfield label : I
/*     */     //   173: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   178: dup
/*     */     //   179: aload #15
/*     */     //   181: if_acmpne -> 235
/*     */     //   184: aload #15
/*     */     //   186: areturn
/*     */     //   187: aconst_null
/*     */     //   188: astore #7
/*     */     //   190: aload #14
/*     */     //   192: getfield L$3 : Ljava/lang/Object;
/*     */     //   195: checkcast io/lettuce/core/api/sync/RedisCommands
/*     */     //   198: astore #6
/*     */     //   200: aload #14
/*     */     //   202: getfield L$2 : Ljava/lang/Object;
/*     */     //   205: checkcast java/lang/String
/*     */     //   208: astore #5
/*     */     //   210: aload #14
/*     */     //   212: getfield L$1 : Ljava/lang/Object;
/*     */     //   215: checkcast kotlin/jvm/functions/Function1
/*     */     //   218: astore_3
/*     */     //   219: aload #14
/*     */     //   221: getfield L$0 : Ljava/lang/Object;
/*     */     //   224: checkcast com/intellij/ml/llm/matterhorn/core/llm/RedisAICaches
/*     */     //   227: astore_0
/*     */     //   228: aload #13
/*     */     //   230: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   233: aload #13
/*     */     //   235: checkcast java/lang/String
/*     */     //   238: dup
/*     */     //   239: ifnull -> 248
/*     */     //   242: invokestatic parseBoolean : (Ljava/lang/String;)Z
/*     */     //   245: goto -> 250
/*     */     //   248: pop
/*     */     //   249: iconst_1
/*     */     //   250: istore #8
/*     */     //   252: nop
/*     */     //   253: iload #8
/*     */     //   255: ifeq -> 299
/*     */     //   258: aload #6
/*     */     //   260: aload #5
/*     */     //   262: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   267: checkcast java/lang/String
/*     */     //   270: astore #7
/*     */     //   272: goto -> 299
/*     */     //   275: astore #9
/*     */     //   277: iconst_0
/*     */     //   278: istore #10
/*     */     //   280: ldc com/intellij/ml/llm/matterhorn/core/llm/RedisAICaches
/*     */     //   282: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   285: dup
/*     */     //   286: ldc 'getInstance(...)'
/*     */     //   288: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   291: aload #9
/*     */     //   293: checkcast java/lang/Throwable
/*     */     //   296: invokevirtual error : (Ljava/lang/Throwable;)V
/*     */     //   299: aload #7
/*     */     //   301: ifnull -> 344
/*     */     //   304: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*     */     //   307: checkcast kotlinx/serialization/json/Json
/*     */     //   310: astore #9
/*     */     //   312: iconst_0
/*     */     //   313: istore #10
/*     */     //   315: aload #9
/*     */     //   317: aload #9
/*     */     //   319: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*     */     //   322: pop
/*     */     //   323: getstatic com/intellij/ml/llm/matterhorn/llm/AIAnswer.Companion : Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer$Companion;
/*     */     //   326: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   329: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   332: aload #7
/*     */     //   334: invokevirtual decodeFromString : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   337: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   340: invokevirtual asCached : ()Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   343: areturn
/*     */     //   344: aload_3
/*     */     //   345: aload #14
/*     */     //   347: aload #14
/*     */     //   349: aload_0
/*     */     //   350: putfield L$0 : Ljava/lang/Object;
/*     */     //   353: aload #14
/*     */     //   355: aload #5
/*     */     //   357: putfield L$1 : Ljava/lang/Object;
/*     */     //   360: aload #14
/*     */     //   362: aload #6
/*     */     //   364: putfield L$2 : Ljava/lang/Object;
/*     */     //   367: aload #14
/*     */     //   369: aconst_null
/*     */     //   370: putfield L$3 : Ljava/lang/Object;
/*     */     //   373: aload #14
/*     */     //   375: iconst_2
/*     */     //   376: putfield label : I
/*     */     //   379: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   384: dup
/*     */     //   385: aload #15
/*     */     //   387: if_acmpne -> 429
/*     */     //   390: aload #15
/*     */     //   392: areturn
/*     */     //   393: aload #14
/*     */     //   395: getfield L$2 : Ljava/lang/Object;
/*     */     //   398: checkcast io/lettuce/core/api/sync/RedisCommands
/*     */     //   401: astore #6
/*     */     //   403: aload #14
/*     */     //   405: getfield L$1 : Ljava/lang/Object;
/*     */     //   408: checkcast java/lang/String
/*     */     //   411: astore #5
/*     */     //   413: aload #14
/*     */     //   415: getfield L$0 : Ljava/lang/Object;
/*     */     //   418: checkcast com/intellij/ml/llm/matterhorn/core/llm/RedisAICaches
/*     */     //   421: astore_0
/*     */     //   422: aload #13
/*     */     //   424: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   427: aload #13
/*     */     //   429: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   432: astore #9
/*     */     //   434: aload_0
/*     */     //   435: getfield propertyProvider : Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   438: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
/*     */     //   441: invokevirtual getMATTERHORN_CAN_WRITE_TO_REDIS : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   444: aload #14
/*     */     //   446: aload #14
/*     */     //   448: aload #5
/*     */     //   450: putfield L$0 : Ljava/lang/Object;
/*     */     //   453: aload #14
/*     */     //   455: aload #6
/*     */     //   457: putfield L$1 : Ljava/lang/Object;
/*     */     //   460: aload #14
/*     */     //   462: aload #9
/*     */     //   464: putfield L$2 : Ljava/lang/Object;
/*     */     //   467: aload #14
/*     */     //   469: iconst_3
/*     */     //   470: putfield label : I
/*     */     //   473: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   478: dup
/*     */     //   479: aload #15
/*     */     //   481: if_acmpne -> 524
/*     */     //   484: aload #15
/*     */     //   486: areturn
/*     */     //   487: aload #14
/*     */     //   489: getfield L$2 : Ljava/lang/Object;
/*     */     //   492: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   495: astore #9
/*     */     //   497: aload #14
/*     */     //   499: getfield L$1 : Ljava/lang/Object;
/*     */     //   502: checkcast io/lettuce/core/api/sync/RedisCommands
/*     */     //   505: astore #6
/*     */     //   507: aload #14
/*     */     //   509: getfield L$0 : Ljava/lang/Object;
/*     */     //   512: checkcast java/lang/String
/*     */     //   515: astore #5
/*     */     //   517: aload #13
/*     */     //   519: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   522: aload #13
/*     */     //   524: checkcast java/lang/String
/*     */     //   527: dup
/*     */     //   528: ifnull -> 537
/*     */     //   531: invokestatic parseBoolean : (Ljava/lang/String;)Z
/*     */     //   534: goto -> 539
/*     */     //   537: pop
/*     */     //   538: iconst_1
/*     */     //   539: istore #10
/*     */     //   541: nop
/*     */     //   542: iload #10
/*     */     //   544: ifeq -> 617
/*     */     //   547: aload #6
/*     */     //   549: aload #5
/*     */     //   551: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*     */     //   554: checkcast kotlinx/serialization/json/Json
/*     */     //   557: astore #11
/*     */     //   559: iconst_0
/*     */     //   560: istore #12
/*     */     //   562: aload #11
/*     */     //   564: aload #11
/*     */     //   566: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*     */     //   569: pop
/*     */     //   570: getstatic com/intellij/ml/llm/matterhorn/llm/AIAnswer.Companion : Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer$Companion;
/*     */     //   573: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   576: checkcast kotlinx/serialization/SerializationStrategy
/*     */     //   579: aload #9
/*     */     //   581: invokevirtual encodeToString : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   584: invokeinterface set : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   589: pop
/*     */     //   590: goto -> 617
/*     */     //   593: astore #11
/*     */     //   595: iconst_0
/*     */     //   596: istore #12
/*     */     //   598: ldc com/intellij/ml/llm/matterhorn/core/llm/RedisAICaches
/*     */     //   600: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   603: dup
/*     */     //   604: ldc 'getInstance(...)'
/*     */     //   606: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   609: aload #11
/*     */     //   611: checkcast java/lang/Throwable
/*     */     //   614: invokevirtual error : (Ljava/lang/Throwable;)V
/*     */     //   617: aload #9
/*     */     //   619: areturn
/*     */     //   620: new java/lang/IllegalStateException
/*     */     //   623: dup
/*     */     //   624: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   627: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   630: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #111	-> 63
/*     */     //   #112	-> 105
/*     */     //   #113	-> 115
/*     */     //   #115	-> 126
/*     */     //   #116	-> 129
/*     */     //   #111	-> 184
/*     */     //   #116	-> 235
/*     */     //   #116	-> 245
/*     */     //   #117	-> 252
/*     */     //   #118	-> 253
/*     */     //   #119	-> 258
/*     */     //   #122	-> 275
/*     */     //   #123	-> 277
/*     */     //   #220	-> 280
/*     */     //   #123	-> 291
/*     */     //   #126	-> 299
/*     */     //   #127	-> 304
/*     */     //   #221	-> 315
/*     */     //   #127	-> 340
/*     */     //   #130	-> 344
/*     */     //   #111	-> 390
/*     */     //   #131	-> 434
/*     */     //   #111	-> 484
/*     */     //   #131	-> 524
/*     */     //   #131	-> 534
/*     */     //   #132	-> 541
/*     */     //   #133	-> 542
/*     */     //   #134	-> 547
/*     */     //   #222	-> 562
/*     */     //   #134	-> 584
/*     */     //   #137	-> 593
/*     */     //   #138	-> 595
/*     */     //   #223	-> 598
/*     */     //   #138	-> 609
/*     */     //   #141	-> 617
/*     */     //   #111	-> 620
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	82	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches;
/*     */     //   228	17	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches;
/*     */     //   245	46	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches;
/*     */     //   291	102	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches;
/*     */     //   422	56	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches;
/*     */     //   105	10	1	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   105	10	2	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   105	82	3	builder	Lkotlin/jvm/functions/Function1;
/*     */     //   219	26	3	builder	Lkotlin/jvm/functions/Function1;
/*     */     //   245	46	3	builder	Lkotlin/jvm/functions/Function1;
/*     */     //   291	13	3	builder	Lkotlin/jvm/functions/Function1;
/*     */     //   344	40	3	builder	Lkotlin/jvm/functions/Function1;
/*     */     //   115	72	5	hash	Ljava/lang/String;
/*     */     //   210	35	5	hash	Ljava/lang/String;
/*     */     //   245	46	5	hash	Ljava/lang/String;
/*     */     //   291	102	5	hash	Ljava/lang/String;
/*     */     //   413	74	5	hash	Ljava/lang/String;
/*     */     //   517	17	5	hash	Ljava/lang/String;
/*     */     //   534	25	5	hash	Ljava/lang/String;
/*     */     //   126	61	6	commands	Lio/lettuce/core/api/sync/RedisCommands;
/*     */     //   200	45	6	commands	Lio/lettuce/core/api/sync/RedisCommands;
/*     */     //   245	46	6	commands	Lio/lettuce/core/api/sync/RedisCommands;
/*     */     //   291	102	6	commands	Lio/lettuce/core/api/sync/RedisCommands;
/*     */     //   403	84	6	commands	Lio/lettuce/core/api/sync/RedisCommands;
/*     */     //   507	27	6	commands	Lio/lettuce/core/api/sync/RedisCommands;
/*     */     //   534	25	6	commands	Lio/lettuce/core/api/sync/RedisCommands;
/*     */     //   129	58	7	cachedAnswer	Ljava/lang/String;
/*     */     //   200	45	7	cachedAnswer	Ljava/lang/String;
/*     */     //   245	27	7	cachedAnswer	Ljava/lang/String;
/*     */     //   272	19	7	cachedAnswer	Ljava/lang/String;
/*     */     //   291	46	7	cachedAnswer	Ljava/lang/String;
/*     */     //   252	6	8	canReadFromRedis	Z
/*     */     //   277	22	9	e	Ljava/lang/Exception;
/*     */     //   312	25	9	this_$iv	Lkotlinx/serialization/json/Json;
/*     */     //   434	53	9	response	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   497	37	9	response	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   534	50	9	response	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   584	25	9	response	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   609	11	9	response	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   541	6	10	canWriteToRedis	Z
/*     */     //   559	25	11	this_$iv	Lkotlinx/serialization/json/Json;
/*     */     //   595	22	11	e	Ljava/lang/Exception;
/*     */     //   280	11	10	$i$f$logger	I
/*     */     //   315	22	10	$i$f$decodeFromString	I
/*     */     //   562	22	12	$i$f$encodeToString	I
/*     */     //   598	11	12	$i$f$logger	I
/*     */     //   0	631	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	567	14	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	560	13	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   252	272	275	java/lang/Exception
/*     */     //   541	590	593	java/lang/Exception
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void close() {
/* 145 */     this.connection.close();
/* 146 */     this.client.shutdown();
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\002J\026\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\007J\n\020\f\032\0020\005*\0020\005¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches$Companion;", "", "<init>", "()V", "serializeParametersForHash", "", "parameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "getQueryHash", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "fixUnstableTextForCaches", "core-llm"})
/*     */   @SourceDebugExtension({"SMAP\nAICaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICaches.kt\ncom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches$Companion\n+ 2 Json.kt\nkotlinx/serialization/json/JsonKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,219:1\n324#2:220\n205#3:221\n205#3:222\n1863#4,2:223\n14#5:225\n*S KotlinDebug\n*F\n+ 1 AICaches.kt\ncom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches$Companion\n*L\n155#1:220\n160#1:221\n164#1:222\n195#1:223,2\n214#1:225\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/* 151 */     private final String serializeParametersForHash(ModelParameters parameters) { Json jsonEncoder = JsonKt.Json$default(null, Companion::serializeParametersForHash$lambda$0, 1, null);
/*     */ 
/*     */ 
/*     */       
/* 155 */       Json $this$encodeToJsonElement$iv = jsonEncoder; int $i$f$encodeToJsonElement = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 220 */       $this$encodeToJsonElement$iv.getSerializersModule(); JsonObject original = JsonElementKt.getJsonObject($this$encodeToJsonElement$iv.encodeToJsonElement((SerializationStrategy)ModelParameters.Companion.serializer(), parameters)); JsonObject transformed = JsonUtilsKt.with(original, "model", (JsonElement)JsonUtilsKt.without(JsonElementKt.getJsonObject((JsonElement)MapsKt.getValue((Map)original, "model")), "capabilities")); Json this_$iv = (Json)Json.Default; int $i$f$encodeToString = 0;
/* 221 */       this_$iv.getSerializersModule(); return this_$iv.encodeToString((SerializationStrategy)JsonObject.Companion.serializer(), transformed); }
/* 222 */     private static final Unit serializeParametersForHash$lambda$0(JsonBuilder $this$Json) { Intrinsics.checkNotNullParameter($this$Json, "$this$Json"); $this$Json.setEncodeDefaults(true); $this$Json.setExplicitNulls(false); return Unit.INSTANCE; } @NotNull public final String getQueryHash(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters) { Intrinsics.checkNotNullParameter(chat, "chat"); Intrinsics.checkNotNullParameter(modelParameters, "modelParameters"); Json this_$iv = (Json)Json.Default; int $i$f$encodeToString = 0; this_$iv.getSerializersModule(); String chatSerialized = this_$iv.encodeToString((SerializationStrategy)MatterhornChat.Companion.serializer(), chat); String paramsSerialized = serializeParametersForHash(modelParameters); return HashUtilsKt.hash256(fixUnstableTextForCaches(chatSerialized) + fixUnstableTextForCaches(chatSerialized)); } @NotNull public final String fixUnstableTextForCaches(@NotNull String $this$fixUnstableTextForCaches) { Intrinsics.checkNotNullParameter($this$fixUnstableTextForCaches, "<this>"); Regex[] arrayOfRegex = new Regex[4]; arrayOfRegex[0] = new Regex("(\\s*)(\\d+\\.\\d+)(\\s*seconds)"); arrayOfRegex[1] = new Regex("(\\bin\\s+)(\\d+\\.\\d+)(\\s*s(?:econds)?)(?=\\s*==*)"); arrayOfRegex[2] = new Regex("(in\\s+)(\\d+\\.\\d+)(s)"); arrayOfRegex[3] = new Regex("(\\s*)(\\d+\\.\\d+)(\\s*Mi?B/s)"); List regexList = CollectionsKt.listOf((Object[])arrayOfRegex); Regex regexID = new Regex("Root=1-[0-9a-f]{8}-[0-9a-f]{24}"); Regex regexPath = new Regex("temp/buildTmp/[^/]+/"); Regex regexAddr = new Regex(" at 0x[0-9a-fA-F]+>"); Regex regexSphinx = new Regex("(Sphinx[\\s-]v?\\d+\\.\\d+\\.\\d+\\+)/[0-9a-fA-F]{7,10}"); Regex regexUUID = new Regex("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"); Regex regexDateTime1 = new Regex("\\d{1,2}/[A-Za-z]{3}/\\d{4} \\d{2}:\\d{2}:\\d{2}"); Regex regexDateTime2 = new Regex("\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}"); Regex regexDateTime3 = new Regex("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}(.\\d{4,8})?"); Regex regexDateTime4 = new Regex("[A-Za-z]+\\s\\d{1,2},\\s\\d{4}\\s-\\s\\d{2}:\\d{2}:\\d{2}"); Regex regexDateTime5 = new Regex("\\b[A-Z][a-z]{2}\\s+\\d{1,2}\\s\\d{2}:\\d{2}\\b"); Regex regexDateTime6 = new Regex(".dev202\\d{11}"); Regex regexDate = new Regex(".d202\\d{5}"); Regex regexTime = new Regex("\\(\\d{1,2}:\\d{2}:\\d{2}\\)"); Regex regexSeed = new Regex("(random seed:\\s*)\\d{1,10}"); Regex regexSeed2 = new Regex("\\(PYTHONHASHSEED=\\d+\\)"); Regex regexLibVersion = new Regex("(\\w+)-(\\d+\\.\\d+\\.\\d+)"); Object result = null; result = $this$fixUnstableTextForCaches; Iterable $this$forEach$iv = regexList; int $i$f$forEach = 0;
/* 223 */       Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Regex regex = (Regex)element$iv; int $i$a$-forEach-RedisAICaches$Companion$fixUnstableTextForCaches$1 = 0; CharSequence charSequence1 = (CharSequence)result; String str1 = "$11$3"; result = regex.replace(charSequence1, str1); }
/*     */        CharSequence charSequence = (CharSequence)result; String str = "Root=1-11111111-111111111111111111111111"; result = regexID.replace(charSequence, str); charSequence = (CharSequence)result; str = "temp/buildTmp/tmp/"; result = regexPath.replace(charSequence, str); charSequence = (CharSequence)result; str = ">"; result = regexAddr.replace(charSequence, str); charSequence = (CharSequence)result; str = "$1"; result = regexSphinx.replace(charSequence, str); charSequence = (CharSequence)result; str = "123e4567-e89b-12d3-a456-426614174000"; result = regexUUID.replace(charSequence, str); charSequence = (CharSequence)result; str = "01/Jan/2024 00:00:00"; result = regexDateTime1.replace(charSequence, str); charSequence = (CharSequence)result; str = "2024-01-01 00:00"; result = regexDateTime2.replace(charSequence, str); charSequence = (CharSequence)result; str = "2024-01-01T00:00:00"; result = regexDateTime3.replace(charSequence, str); charSequence = (CharSequence)result; str = "January 01, 2024 - 00:00:00"; result = regexDateTime4.replace(charSequence, str); charSequence = (CharSequence)result; str = "Jan 01 00:00"; result = regexDateTime5.replace(charSequence, str); charSequence = (CharSequence)result; str = ".dev20250101"; result = regexDateTime6.replace(charSequence, str); charSequence = (CharSequence)result; str = ".d20250101"; result = regexDate.replace(charSequence, str); charSequence = (CharSequence)result; str = "(0:00:00)"; result = regexTime.replace(charSequence, str); charSequence = (CharSequence)result; str = "$11"; result = regexSeed.replace(charSequence, str); charSequence = (CharSequence)result; str = "(PYTHONHASHSEED=1)"; result = regexSeed2.replace(charSequence, str); charSequence = (CharSequence)result; str = "$1-0.0.0"; result = regexLibVersion.replace(charSequence, str); if (!Intrinsics.areEqual(result, $this$fixUnstableTextForCaches)) {
/* 225 */         int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(RedisAICaches.class), "getInstance(...)"); Logger.getInstance(RedisAICaches.class).warn("Chat content was changed while calculating redis key");
/*     */       } 
/*     */       return (String)result; }
/*     */   
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AICaches.kt", l = {116, 130, 131}, i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "builder", "hash", "commands", "this", "hash", "commands", "hash", "commands", "response"}, m = "lookupOrBuild", c = "com.intellij.ml.llm.matterhorn.core.llm.RedisAICaches")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RedisAICaches$lookupOrBuild$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     RedisAICaches$lookupOrBuild$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RedisAICaches.this.lookupOrBuild(null, null, null, (Continuation<? super AIAnswer>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\RedisAICaches.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */