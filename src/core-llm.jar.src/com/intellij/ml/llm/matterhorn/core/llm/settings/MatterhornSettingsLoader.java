/*     */ package com.intellij.ml.llm.matterhorn.core.llm.settings;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.llm.LlmProvider;
/*     */ import com.intellij.ml.llm.matterhorn.settings.CoreProperties;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornProperty;
/*     */ import java.io.FileInputStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Properties;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.io.CloseableKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineName;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020$\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\006\030\0002\0020\001B=\022\006\020\002\032\0020\003\022\026\b\002\020\004\032\020\022\004\022\0020\006\022\006\022\004\030\0010\0060\005\022\024\b\002\020\007\032\016\022\n\022\b\022\004\022\0020\n0\t0\b¢\006\004\b\013\020\fJ\016\020\017\032\0020\020H@¢\006\002\020\021J\032\020\022\032\016\022\004\022\0020\006\022\004\022\0020\0240\023H@¢\006\002\020\021J\024\020\025\032\016\022\004\022\0020\006\022\004\022\0020\0240\023H\002J\036\020\026\032\0020\0272\024\020\030\032\020\022\004\022\0020\006\022\006\022\004\030\0010\0240\031H\002J.\020\032\032\0020\0272\024\020\030\032\020\022\004\022\0020\006\022\006\022\004\030\0010\0240\0312\006\020\033\032\0020\0062\006\020\034\032\0020\006H\002J\024\020\035\032\016\022\004\022\0020\006\022\004\022\0020\0240\023H\002J\024\020\036\032\016\022\004\022\0020\006\022\004\022\0020\0240\023H\002R\034\020\004\032\020\022\004\022\0020\006\022\006\022\004\030\0010\0060\005X\004¢\006\002\n\000R\032\020\007\032\016\022\n\022\b\022\004\022\0020\n0\t0\bX\004¢\006\002\n\000R\016\020\r\032\0020\016X\004¢\006\002\n\000¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getEnv", "Lkotlin/Function1;", "", "getProperties", "Lkotlin/Function0;", "", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "loadSettings", "Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromCoroutineContext", "", "Lcom/intellij/ml/llm/matterhorn/core/llm/settings/Value;", "loadFromPropertyFile", "setDefaultModelAndUrlForKnownProviders", "", "settings", "Ljava/util/HashMap;", "setDefaultModelForKnownProvider", "providerPropertyName", "modelName", "loadFromKnownEnvVariables", "loadFromEnv", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornSettingsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornSettingsService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n126#2:322\n153#2,3:323\n1187#3,2:326\n1261#3,4:328\n1611#3,9:332\n1863#3:341\n1864#3:344\n1620#3:345\n1#4:342\n1#4:343\n*S KotlinDebug\n*F\n+ 1 MatterhornSettingsService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader\n*L\n185#1:322\n185#1:323,3\n199#1:326,2\n199#1:328,4\n288#1:332,9\n288#1:341\n288#1:344\n288#1:345\n288#1:343\n*E\n"})
/*     */ public final class MatterhornSettingsLoader
/*     */ {
/*     */   @NotNull
/*     */   private final Function1<String, String> getEnv;
/*     */   @NotNull
/*     */   private final Function0<List<MatterhornProperty>> getProperties;
/*     */   @NotNull
/*     */   private final CoroutineContext context;
/*     */   
/*     */   public MatterhornSettingsLoader(@NotNull CoroutineScope scope, @NotNull Function1<String, String> getEnv, @NotNull Function0<List<MatterhornProperty>> getProperties) {
/* 129 */     this.getEnv = getEnv;
/* 130 */     this.getProperties = getProperties;
/*     */     
/* 132 */     this.context = scope.getCoroutineContext().plus((CoroutineContext)Dispatchers.getIO());
/*     */   } private static final List _init_$lambda$0() { return MatterhornProperties.INSTANCE.collectAllProperties(); } @Nullable
/*     */   public final Object loadSettings(@NotNull Continuation $completion) {
/* 135 */     return BuildersKt.withContext(this.context.plus((CoroutineContext)new CoroutineName("Settings loading")), new MatterhornSettingsLoader$loadSettings$2(null), $completion);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "MatterhornSettingsService.kt", l = {136}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsLoader$loadSettings$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nMatterhornSettingsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornSettingsService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader$loadSettings$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,321:1\n14#2:322\n*S KotlinDebug\n*F\n+ 1 MatterhornSettingsService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader$loadSettings$2\n*L\n165#1:322\n*E\n"})
/*     */   static final class MatterhornSettingsLoader$loadSettings$2
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super MatterhornSettings>, Object>
/*     */   {
/*     */     int label;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     MatterhornSettingsLoader$loadSettings$2(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #14
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 567, 0 -> 32, 1 -> 61
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;
/*     */       //   40: aload_0
/*     */       //   41: checkcast kotlin/coroutines/Continuation
/*     */       //   44: aload_0
/*     */       //   45: iconst_1
/*     */       //   46: putfield label : I
/*     */       //   49: invokestatic access$loadFromCoroutineContext : (Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   52: dup
/*     */       //   53: aload #14
/*     */       //   55: if_acmpne -> 66
/*     */       //   58: aload #14
/*     */       //   60: areturn
/*     */       //   61: aload_1
/*     */       //   62: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   65: aload_1
/*     */       //   66: checkcast java/util/Map
/*     */       //   69: astore_2
/*     */       //   70: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
/*     */       //   73: invokevirtual getHasMatterhornSettings : ()Z
/*     */       //   76: ifeq -> 89
/*     */       //   79: aload_0
/*     */       //   80: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;
/*     */       //   83: invokestatic access$loadFromPropertyFile : (Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;)Ljava/util/Map;
/*     */       //   86: goto -> 92
/*     */       //   89: invokestatic emptyMap : ()Ljava/util/Map;
/*     */       //   92: astore_3
/*     */       //   93: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
/*     */       //   96: invokevirtual getHasMatterhornSettings : ()Z
/*     */       //   99: ifeq -> 112
/*     */       //   102: aload_0
/*     */       //   103: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;
/*     */       //   106: invokestatic access$loadFromEnv : (Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;)Ljava/util/Map;
/*     */       //   109: goto -> 115
/*     */       //   112: invokestatic emptyMap : ()Ljava/util/Map;
/*     */       //   115: astore #4
/*     */       //   117: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
/*     */       //   120: invokevirtual getHasMatterhornSettings : ()Z
/*     */       //   123: ifeq -> 136
/*     */       //   126: aload_0
/*     */       //   127: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;
/*     */       //   130: invokestatic access$loadFromKnownEnvVariables : (Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;)Ljava/util/Map;
/*     */       //   133: goto -> 139
/*     */       //   136: invokestatic emptyMap : ()Ljava/util/Map;
/*     */       //   139: astore #5
/*     */       //   141: aload_0
/*     */       //   142: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;
/*     */       //   145: invokestatic access$getGetProperties$p : (Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;)Lkotlin/jvm/functions/Function0;
/*     */       //   148: invokeinterface invoke : ()Ljava/lang/Object;
/*     */       //   153: checkcast java/util/List
/*     */       //   156: astore #6
/*     */       //   158: new java/util/HashMap
/*     */       //   161: dup
/*     */       //   162: invokespecial <init> : ()V
/*     */       //   165: astore #7
/*     */       //   167: aload #6
/*     */       //   169: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   174: astore #8
/*     */       //   176: aload #8
/*     */       //   178: invokeinterface hasNext : ()Z
/*     */       //   183: ifeq -> 317
/*     */       //   186: aload #8
/*     */       //   188: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   193: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornProperty
/*     */       //   196: astore #9
/*     */       //   198: aload #9
/*     */       //   200: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   203: astore #10
/*     */       //   205: aload_2
/*     */       //   206: aload #10
/*     */       //   208: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   213: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/Value
/*     */       //   216: dup
/*     */       //   217: ifnonnull -> 266
/*     */       //   220: pop
/*     */       //   221: aload_3
/*     */       //   222: aload #10
/*     */       //   224: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   229: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/Value
/*     */       //   232: dup
/*     */       //   233: ifnonnull -> 266
/*     */       //   236: pop
/*     */       //   237: aload #4
/*     */       //   239: aload #10
/*     */       //   241: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   246: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/Value
/*     */       //   249: dup
/*     */       //   250: ifnonnull -> 266
/*     */       //   253: pop
/*     */       //   254: aload #5
/*     */       //   256: aload #10
/*     */       //   258: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   263: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/Value
/*     */       //   266: astore #11
/*     */       //   268: aload #11
/*     */       //   270: ifnonnull -> 299
/*     */       //   273: aload #9
/*     */       //   275: invokevirtual getDefaultValue : ()Ljava/lang/String;
/*     */       //   278: astore #12
/*     */       //   280: aload #12
/*     */       //   282: ifnull -> 299
/*     */       //   285: new com/intellij/ml/llm/matterhorn/core/llm/settings/Value
/*     */       //   288: dup
/*     */       //   289: aload #12
/*     */       //   291: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/Origin.DefaultXmlValues : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/Origin;
/*     */       //   294: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/settings/Origin;)V
/*     */       //   297: astore #11
/*     */       //   299: aload #7
/*     */       //   301: checkcast java/util/Map
/*     */       //   304: aload #10
/*     */       //   306: aload #11
/*     */       //   308: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   313: pop
/*     */       //   314: goto -> 176
/*     */       //   317: aload_0
/*     */       //   318: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;
/*     */       //   321: aload #7
/*     */       //   323: invokestatic access$setDefaultModelAndUrlForKnownProviders : (Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader;Ljava/util/HashMap;)V
/*     */       //   326: iconst_0
/*     */       //   327: istore #9
/*     */       //   329: ldc com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService
/*     */       //   331: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   334: dup
/*     */       //   335: ldc 'getInstance(...)'
/*     */       //   337: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   340: astore #8
/*     */       //   342: aload #7
/*     */       //   344: checkcast java/util/Map
/*     */       //   347: invokeinterface entrySet : ()Ljava/util/Set;
/*     */       //   352: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   357: astore #9
/*     */       //   359: aload #9
/*     */       //   361: invokeinterface hasNext : ()Z
/*     */       //   366: ifeq -> 554
/*     */       //   369: aload #9
/*     */       //   371: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   376: checkcast java/util/Map$Entry
/*     */       //   379: astore #10
/*     */       //   381: aload #10
/*     */       //   383: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   388: ifnull -> 534
/*     */       //   391: aload #10
/*     */       //   393: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   398: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/Value
/*     */       //   401: dup
/*     */       //   402: ifnull -> 411
/*     */       //   405: invokevirtual getValue : ()Ljava/lang/String;
/*     */       //   408: goto -> 413
/*     */       //   411: pop
/*     */       //   412: aconst_null
/*     */       //   413: astore #11
/*     */       //   415: aload #10
/*     */       //   417: invokeinterface getKey : ()Ljava/lang/Object;
/*     */       //   422: checkcast java/lang/String
/*     */       //   425: ldc '.key'
/*     */       //   427: iconst_0
/*     */       //   428: iconst_2
/*     */       //   429: aconst_null
/*     */       //   430: invokestatic endsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */       //   433: istore #12
/*     */       //   435: aload #11
/*     */       //   437: ifnull -> 486
/*     */       //   440: iload #12
/*     */       //   442: ifeq -> 486
/*     */       //   445: aload #11
/*     */       //   447: invokevirtual length : ()I
/*     */       //   450: bipush #30
/*     */       //   452: if_icmple -> 476
/*     */       //   455: aload #11
/*     */       //   457: aload #11
/*     */       //   459: invokevirtual length : ()I
/*     */       //   462: iconst_5
/*     */       //   463: isub
/*     */       //   464: invokevirtual substring : (I)Ljava/lang/String;
/*     */       //   467: dup
/*     */       //   468: ldc 'substring(...)'
/*     */       //   470: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   473: goto -> 478
/*     */       //   476: ldc ''
/*     */       //   478: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   483: goto -> 488
/*     */       //   486: aload #11
/*     */       //   488: astore #13
/*     */       //   490: aload #8
/*     */       //   492: aload #10
/*     */       //   494: invokeinterface getKey : ()Ljava/lang/Object;
/*     */       //   499: aload #13
/*     */       //   501: aload #10
/*     */       //   503: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   508: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/Value
/*     */       //   511: dup
/*     */       //   512: ifnull -> 521
/*     */       //   515: invokevirtual getOrigin : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/Origin;
/*     */       //   518: goto -> 523
/*     */       //   521: pop
/*     */       //   522: aconst_null
/*     */       //   523: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/settings/Origin;)Ljava/lang/String;
/*     */       //   528: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   531: goto -> 359
/*     */       //   534: aload #8
/*     */       //   536: aload #10
/*     */       //   538: invokeinterface getKey : ()Ljava/lang/Object;
/*     */       //   543: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   548: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   551: goto -> 359
/*     */       //   554: new com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings
/*     */       //   557: dup
/*     */       //   558: aload #7
/*     */       //   560: checkcast java/util/Map
/*     */       //   563: invokespecial <init> : (Ljava/util/Map;)V
/*     */       //   566: areturn
/*     */       //   567: new java/lang/IllegalStateException
/*     */       //   570: dup
/*     */       //   571: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   573: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   576: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #135	-> 3
/*     */       //   #136	-> 36
/*     */       //   #135	-> 58
/*     */       //   #138	-> 70
/*     */       //   #139	-> 93
/*     */       //   #140	-> 117
/*     */       //   #142	-> 141
/*     */       //   #143	-> 158
/*     */       //   #144	-> 167
/*     */       //   #145	-> 198
/*     */       //   #147	-> 205
/*     */       //   #148	-> 220
/*     */       //   #147	-> 232
/*     */       //   #149	-> 236
/*     */       //   #147	-> 249
/*     */       //   #150	-> 254
/*     */       //   #147	-> 266
/*     */       //   #153	-> 268
/*     */       //   #154	-> 273
/*     */       //   #155	-> 280
/*     */       //   #156	-> 285
/*     */       //   #160	-> 299
/*     */       //   #163	-> 317
/*     */       //   #165	-> 326
/*     */       //   #322	-> 329
/*     */       //   #165	-> 340
/*     */       //   #166	-> 342
/*     */       //   #166	-> 357
/*     */       //   #167	-> 381
/*     */       //   #168	-> 391
/*     */       //   #169	-> 415
/*     */       //   #171	-> 435
/*     */       //   #171	-> 476
/*     */       //   #170	-> 488
/*     */       //   #172	-> 490
/*     */       //   #174	-> 534
/*     */       //   #178	-> 554
/*     */       //   #135	-> 567
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   70	244	2	settingsFromCoroutineContext	Ljava/util/Map;
/*     */       //   314	3	2	settingsFromCoroutineContext	Ljava/util/Map;
/*     */       //   93	221	3	settingsFromPropertyFile	Ljava/util/Map;
/*     */       //   314	3	3	settingsFromPropertyFile	Ljava/util/Map;
/*     */       //   117	197	4	settingsFromEnvironment	Ljava/util/Map;
/*     */       //   314	3	4	settingsFromEnvironment	Ljava/util/Map;
/*     */       //   141	173	5	settingsFromKnownEnvVariables	Ljava/util/Map;
/*     */       //   314	3	5	settingsFromKnownEnvVariables	Ljava/util/Map;
/*     */       //   158	18	6	properties	Ljava/util/List;
/*     */       //   167	147	7	settings	Ljava/util/HashMap;
/*     */       //   314	26	7	settings	Ljava/util/HashMap;
/*     */       //   340	17	7	settings	Ljava/util/HashMap;
/*     */       //   357	116	7	settings	Ljava/util/HashMap;
/*     */       //   473	94	7	settings	Ljava/util/HashMap;
/*     */       //   342	15	8	logger	Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   357	116	8	logger	Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   473	94	8	logger	Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   198	82	9	property	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   205	109	10	name	Ljava/lang/String;
/*     */       //   381	92	10	entry	Ljava/util/Map$Entry;
/*     */       //   473	38	10	entry	Ljava/util/Map$Entry;
/*     */       //   534	17	10	entry	Ljava/util/Map$Entry;
/*     */       //   268	17	11	value	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/Value;
/*     */       //   299	15	11	value	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/Value;
/*     */       //   415	58	11	value	Ljava/lang/String;
/*     */       //   486	2	11	value	Ljava/lang/String;
/*     */       //   280	19	12	defaultValue	Ljava/lang/String;
/*     */       //   435	20	12	isSecret	Z
/*     */       //   490	21	13	text	Ljava/lang/String;
/*     */       //   329	11	9	$i$f$logger	I
/*     */       //   0	577	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsLoader$loadSettings$2;
/*     */       //   36	531	1	$result	Ljava/lang/Object;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super MatterhornSettingsLoader$loadSettings$2> $completion) {
/*     */       return (Continuation<Unit>)new MatterhornSettingsLoader$loadSettings$2($completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((MatterhornSettingsLoader$loadSettings$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object loadFromCoroutineContext(Continuation $completion)
/*     */   {
/* 184 */     MatterhornSettingsService.ContextSettingsCoroutineElement settings = (MatterhornSettingsService.ContextSettingsCoroutineElement)$completion.getContext().get(MatterhornSettingsService.ContextSettingsKey.INSTANCE);
/* 185 */     if (settings != null && settings.getSettings() != null) { Map<String, String> $this$map$iv = settings.getSettings(); int $i$f$map = 0;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 322 */       Map<String, String> map1 = $this$map$iv; Collection<Pair> destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 323 */       for (Map.Entry<String, String> item$iv$iv : map1.entrySet()) {
/* 324 */         Map.Entry<String, String> entry1 = item$iv$iv; Collection<Pair> collection = destination$iv$iv; int $i$a$-map-MatterhornSettingsLoader$loadFromCoroutineContext$2 = 0; collection.add(TuplesKt.to(entry1.getKey(), new Value((String)entry1.getValue(), Origin.KinetoSessionParameters)));
/* 325 */       }  if (MapsKt.toMap(destination$iv$iv) == null) { MapsKt.toMap(destination$iv$iv); return MapsKt.emptyMap(); }  return MapsKt.toMap(destination$iv$iv); }  MapsKt.toMap(destination$iv$iv); return MapsKt.emptyMap(); } private final Map<String, Value> loadFromPropertyFile() { String propertyFilePath = (String)this.getEnv.invoke("matterhorn.property.file.path"); if (propertyFilePath == null)
/* 326 */       return MapsKt.emptyMap();  Properties properties = new Properties(); FileInputStream fileInputStream = new FileInputStream(propertyFilePath); Throwable throwable = null; try { FileInputStream inputStream = fileInputStream; int $i$a$-use-MatterhornSettingsLoader$loadFromPropertyFile$1 = 0; properties.load(inputStream); Unit unit = Unit.INSTANCE; } catch (Throwable throwable1) { throwable = throwable1 = null; throw throwable1; } finally { CloseableKt.closeFinally(fileInputStream, throwable); }  Intrinsics.checkNotNullExpressionValue(properties.entrySet(), "<get-entries>(...)"); Set<Map.Entry<Object, Object>> set1 = properties.entrySet(); int $i$f$associate = 0; int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set1, 10)), 16);
/* 327 */     Set<Map.Entry<Object, Object>> set2 = set1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateTo = 0;
/* 328 */     for (Object<Object, Object> element$iv$iv : set2) {
/* 329 */       Map<Object, Object> map = destination$iv$iv; Map.Entry it = (Map.Entry)element$iv$iv; int $i$a$-associate-MatterhornSettingsLoader$loadFromPropertyFile$2 = 0; Pair pair = TuplesKt.to(it.getKey().toString(), new Value(it.getValue().toString(), Origin.PropertyFile)); map.put(pair.getFirst(), pair.getSecond());
/*     */     } 
/* 331 */     return (Map)destination$iv$iv; }
/* 332 */   private final void setDefaultModelAndUrlForKnownProviders(HashMap<String, Value> settings) { setDefaultModelForKnownProvider(settings, CoreProperties.INSTANCE.getMATTERHORN_DEFAULT_LLM_PROVIDER().getName(), CoreProperties.INSTANCE.getMATTERHORN_DEFAULT_MODEL().getName()); setDefaultModelForKnownProvider(settings, "primary_model_provider", "primary_model"); setDefaultModelForKnownProvider(settings, "edit_workers_model_provider", "edit_workers_model"); setDefaultModelForKnownProvider(settings, "matterhorn.webgen.llm.provider", "matterhorn.webgen.model"); } private final Map<String, Value> loadFromEnv() { Iterable iterable1 = (Iterable)this.getProperties.invoke(); int $i$f$mapNotNull = 0; Iterable iterable2 = iterable1; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 340 */     Iterable $this$forEach$iv$iv$iv = iterable2; int $i$f$forEach = 0;
/* 341 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0;
/*     */       MatterhornProperty it = (MatterhornProperty)element$iv$iv;
/*     */       int $i$a$-mapNotNull-MatterhornSettingsLoader$loadFromEnv$mapOfEnvs$1 = 0; }
/*     */     
/* 345 */     Map<String, Value> mapOfEnvs = MapsKt.toMap(destination$iv$iv);
/*     */     return mapOfEnvs; }
/*     */ 
/*     */   
/*     */   private final void setDefaultModelForKnownProvider(HashMap<String, Value> settings, String providerPropertyName, String modelName) {
/*     */     Value provider = (Value)settings.get(providerPropertyName);
/*     */     if (provider != null && (Intrinsics.areEqual(provider.getValue(), LlmProvider.OpenAI.toString()) || Intrinsics.areEqual(provider.getValue(), LlmProvider.Anthropic.toString()))) {
/*     */       String providerName = provider.getValue();
/*     */       String str1 = providerName;
/*     */       if (Intrinsics.areEqual(str1, LlmProvider.OpenAI.toString())) {
/*     */         setDefaultModelForKnownProvider$ensureDefaultValue(settings, modelName, "gpt-4o-2024-08-06");
/*     */       } else if (Intrinsics.areEqual(str1, LlmProvider.Anthropic.toString())) {
/*     */         setDefaultModelForKnownProvider$ensureDefaultValue(settings, modelName, "claude-3-7-sonnet-20250219");
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final void setDefaultModelForKnownProvider$ensureDefaultValue(HashMap<String, Value> $settings, String key, String defaultValue) {
/*     */     Value existingValue = (Value)$settings.get(key);
/*     */     String str = (existingValue != null) ? existingValue.getValue() : null;
/*     */     if ((str == null || str.length() == 0))
/*     */       $settings.put(key, new Value(defaultValue, Origin.DefaultModelAndUrlForKnownProviders)); 
/*     */   }
/*     */   
/*     */   private final Map<String, Value> loadFromKnownEnvVariables() {
/*     */     String openaiKey = (String)this.getEnv.invoke(CoreProperties.INSTANCE.getOPENAI_MODEL_KEY().getEnvironmentVariableName());
/*     */     String anthropicKey = (String)this.getEnv.invoke(CoreProperties.INSTANCE.getANTHROPIC_MODEL_KEY().getEnvironmentVariableName());
/*     */     String nebiusKey = (String)this.getEnv.invoke(CoreProperties.INSTANCE.getNEBIUS_MODEL_KEY().getEnvironmentVariableName());
/*     */     String deepSeekKey = (String)this.getEnv.invoke(CoreProperties.INSTANCE.getDEEPSEEK_MODEL_KEY().getEnvironmentVariableName());
/*     */     String googleKey = (String)this.getEnv.invoke(CoreProperties.INSTANCE.getGOOGLE_MODEL_KEY().getEnvironmentVariableName());
/*     */     Origin origin = Origin.KnownEnvironmentVariables;
/*     */     Map<String, Value> map1 = MapsKt.createMapBuilder(), $this$loadFromKnownEnvVariables_u24lambda_u244 = map1;
/*     */     int $i$a$-buildMap-MatterhornSettingsLoader$loadFromKnownEnvVariables$settings$1 = 0;
/*     */     if (openaiKey != null) {
/*     */       $this$loadFromKnownEnvVariables_u24lambda_u244.put(CoreProperties.INSTANCE.getMATTERHORN_DEFAULT_LLM_PROVIDER().getName(), new Value(LlmProvider.OpenAI.toString(), origin));
/*     */       $this$loadFromKnownEnvVariables_u24lambda_u244.put(CoreProperties.INSTANCE.getOPENAI_MODEL_KEY().getName(), new Value(openaiKey, origin));
/*     */     } 
/*     */     if (anthropicKey != null) {
/*     */       $this$loadFromKnownEnvVariables_u24lambda_u244.put(CoreProperties.INSTANCE.getMATTERHORN_DEFAULT_LLM_PROVIDER().getName(), new Value(LlmProvider.Anthropic.toString(), origin));
/*     */       $this$loadFromKnownEnvVariables_u24lambda_u244.put(CoreProperties.INSTANCE.getANTHROPIC_MODEL_KEY().getName(), new Value(anthropicKey, origin));
/*     */     } 
/*     */     if (nebiusKey != null) {
/*     */       $this$loadFromKnownEnvVariables_u24lambda_u244.put(CoreProperties.INSTANCE.getMATTERHORN_DEFAULT_LLM_PROVIDER().getName(), new Value(LlmProvider.Nebius.toString(), origin));
/*     */       $this$loadFromKnownEnvVariables_u24lambda_u244.put(CoreProperties.INSTANCE.getNEBIUS_MODEL_KEY().getName(), new Value(nebiusKey, origin));
/*     */     } 
/*     */     if (deepSeekKey != null) {
/*     */       $this$loadFromKnownEnvVariables_u24lambda_u244.put(CoreProperties.INSTANCE.getMATTERHORN_DEFAULT_LLM_PROVIDER().getName(), new Value(LlmProvider.DeepSeek.toString(), origin));
/*     */       $this$loadFromKnownEnvVariables_u24lambda_u244.put(CoreProperties.INSTANCE.getDEEPSEEK_MODEL_KEY().getName(), new Value(deepSeekKey, origin));
/*     */     } 
/*     */     if (googleKey != null) {
/*     */       $this$loadFromKnownEnvVariables_u24lambda_u244.put(CoreProperties.INSTANCE.getMATTERHORN_DEFAULT_LLM_PROVIDER().getName(), new Value(LlmProvider.Google.toString(), origin));
/*     */       $this$loadFromKnownEnvVariables_u24lambda_u244.put(CoreProperties.INSTANCE.getGOOGLE_MODEL_KEY().getName(), new Value(googleKey, origin));
/*     */     } 
/*     */     Map<String, Value> settings = MapsKt.build(map1);
/*     */     return settings;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\settings\MatterhornSettingsLoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */