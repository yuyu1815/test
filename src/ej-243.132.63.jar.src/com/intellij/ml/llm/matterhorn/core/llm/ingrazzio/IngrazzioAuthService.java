/*     */ package com.intellij.ml.llm.matterhorn.core.llm.ingrazzio;
/*     */ 
/*     */ import com.intellij.credentialStore.CredentialAttributes;
/*     */ import com.intellij.ide.passwordSafe.PasswordSafe;
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.configuration.BuildConfigKt;
/*     */ import com.intellij.ml.llm.matterhorn.configuration.EnvExtensionsKt;
/*     */ import com.intellij.openapi.components.Service;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.util.registry.Registry;
/*     */ import com.intellij.ui.JBAccountInfoService;
/*     */ import io.ktor.http.Url;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.channels.Channel;
/*     */ import kotlinx.coroutines.channels.ChannelKt;
/*     */ import kotlinx.coroutines.channels.ReceiveChannel;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowKt;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.json.Json;
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
/*     */ @Service
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\005\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\f\b\007\030\000 &2\0020\001:\001&B\007¢\006\004\b\002\020\003J\020\020\025\032\004\030\0010\005H@¢\006\002\020\026J\022\020\027\032\0020\0302\b\020\031\032\004\030\0010\005H\002J\020\020\036\032\004\030\0010\005H@¢\006\002\020\026J\026\020\037\032\0020\0222\006\020 \032\0020\005H@¢\006\002\020!J\030\020\"\032\0020\0052\b\b\002\020#\032\0020\022H@¢\006\002\020$J\006\020%\032\0020\030R\020\020\004\032\004\030\0010\005X\016¢\006\002\n\000R\024\020\006\032\0020\0078BX\004¢\006\006\032\004\b\b\020\tR\024\020\n\032\b\022\004\022\0020\f0\013X\004¢\006\002\n\000R\027\020\r\032\b\022\004\022\0020\f0\016¢\006\b\n\000\032\004\b\017\020\020R\021\020\021\032\0020\0228F¢\006\006\032\004\b\023\020\024R\023\020\032\032\004\030\0010\0338F¢\006\006\032\004\b\034\020\035¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;", "", "<init>", "()V", "_accessToken", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "authHelper", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;", "getAuthHelper", "()Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;", "authLinkChannel", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/http/Url;", "authLinkFlow", "Lkotlinx/coroutines/flow/Flow;", "getAuthLinkFlow", "()Lkotlinx/coroutines/flow/Flow;", "shouldUseJbaAccount", "", "getShouldUseJbaAccount", "()Z", "getAccessTokenInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAccessTokenInternal", "", "value", "currentJbAUserName", "", "getCurrentJbAUserName", "()Ljava/lang/String;", "getAccessToken", "checkIngrazzioAccess", "token", "(Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAndAwaitAuthorizationProcess", "openBrowser", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAccessToken", "Companion", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nIngrazzioAuthService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IngrazzioAuthService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,247:1\n222#2:248\n205#2:249\n14#3:250\n*S KotlinDebug\n*F\n+ 1 IngrazzioAuthService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService\n*L\n151#1:248\n167#1:249\n82#1:250\n*E\n"})
/*     */ public final class IngrazzioAuthService
/*     */ {
/*     */   public IngrazzioAuthService() {
/*  86 */     EnvExtensionsKt.assertHasIngrazzio(BuildConfigKt.getConfig());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     this.authLinkChannel = ChannelKt.Channel$default(1, null, null, 6, null);
/*     */     
/*  94 */     this.authLinkFlow = FlowKt.receiveAsFlow((ReceiveChannel)this.authLinkChannel);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$Companion;", "", "<init>", "()V", "accessTokenCredentialAttribute", "Lcom/intellij/credentialStore/CredentialAttributes;", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "core-llm"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private AccessToken _accessToken;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Channel<Url> authLinkChannel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Flow<Url> authLinkFlow;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final CredentialAttributes accessTokenCredentialAttribute = new CredentialAttributes("Junie");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static
/*     */   {
/*     */     int $i$f$logger = 0;
/* 250 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(IngrazzioAuthService.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(IngrazzioAuthService.class);
/*     */   
/*     */   private final GoogleOauthHelper getAuthHelper() {
/*     */     return new GoogleOauthHelper(this.authLinkChannel);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Flow<Url> getAuthLinkFlow() {
/*     */     return this.authLinkFlow;
/*     */   }
/*     */   
/*     */   public final boolean getShouldUseJbaAccount() {
/*     */     return Registry.Companion.is("matterhorn.use.jba.login");
/*     */   }
/*     */   
/*     */   private final Object getAccessTokenInternal(Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$getAccessTokenInternal$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$getAccessTokenInternal$1
/*     */     //   11: astore #10
/*     */     //   13: aload #10
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #10
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$getAccessTokenInternal$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #10
/*     */     //   50: aload #10
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #9
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #11
/*     */     //   62: aload #10
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 514, 0 -> 88, 1 -> 186
/*     */     //   88: aload #9
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield _accessToken : Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   97: ifnull -> 105
/*     */     //   100: aload_0
/*     */     //   101: getfield _accessToken : Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   104: areturn
/*     */     //   105: aload_0
/*     */     //   106: astore #7
/*     */     //   108: nop
/*     */     //   109: aload #7
/*     */     //   111: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   114: invokeinterface isHeadlessEnvironment : ()Z
/*     */     //   119: ifeq -> 293
/*     */     //   122: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   125: ldc 'Checking github token in headless environment'
/*     */     //   127: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   130: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
/*     */     //   133: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   136: astore_2
/*     */     //   137: astore #8
/*     */     //   139: aload_2
/*     */     //   140: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
/*     */     //   143: invokevirtual getINGRAZZIO_GITHUB_ACCESS_TOKEN : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   146: aload #10
/*     */     //   148: aload #10
/*     */     //   150: aload_0
/*     */     //   151: putfield L$0 : Ljava/lang/Object;
/*     */     //   154: aload #10
/*     */     //   156: aload #7
/*     */     //   158: putfield L$1 : Ljava/lang/Object;
/*     */     //   161: aload #10
/*     */     //   163: aload #8
/*     */     //   165: putfield L$2 : Ljava/lang/Object;
/*     */     //   168: aload #10
/*     */     //   170: iconst_1
/*     */     //   171: putfield label : I
/*     */     //   174: invokevirtual getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   177: dup
/*     */     //   178: aload #11
/*     */     //   180: if_acmpne -> 223
/*     */     //   183: aload #11
/*     */     //   185: areturn
/*     */     //   186: aload #10
/*     */     //   188: getfield L$2 : Ljava/lang/Object;
/*     */     //   191: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   194: astore #8
/*     */     //   196: aload #10
/*     */     //   198: getfield L$1 : Ljava/lang/Object;
/*     */     //   201: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   204: astore #7
/*     */     //   206: aload #10
/*     */     //   208: getfield L$0 : Ljava/lang/Object;
/*     */     //   211: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   214: astore_0
/*     */     //   215: nop
/*     */     //   216: aload #9
/*     */     //   218: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   221: aload #9
/*     */     //   223: aload #8
/*     */     //   225: swap
/*     */     //   226: checkcast java/lang/String
/*     */     //   229: astore_3
/*     */     //   230: aload_3
/*     */     //   231: dup
/*     */     //   232: ifnull -> 290
/*     */     //   235: astore #5
/*     */     //   237: astore #8
/*     */     //   239: iconst_0
/*     */     //   240: istore #6
/*     */     //   242: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   245: ldc 'Found github token'
/*     */     //   247: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   250: new com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   253: dup
/*     */     //   254: aload #5
/*     */     //   256: ldc2_w 2
/*     */     //   259: invokestatic ofHours : (J)Ljava/time/Duration;
/*     */     //   262: invokevirtual toSeconds : ()J
/*     */     //   265: l2i
/*     */     //   266: aconst_null
/*     */     //   267: ldc ''
/*     */     //   269: ldc 'GITHUB_ACCESS_TOKEN_TYPE'
/*     */     //   271: aload #5
/*     */     //   273: invokestatic currentTimeMillis : ()J
/*     */     //   276: invokestatic boxLong : (J)Ljava/lang/Long;
/*     */     //   279: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
/*     */     //   282: nop
/*     */     //   283: aload #8
/*     */     //   285: swap
/*     */     //   286: nop
/*     */     //   287: goto -> 292
/*     */     //   290: pop
/*     */     //   291: aconst_null
/*     */     //   292: areturn
/*     */     //   293: aload_0
/*     */     //   294: invokevirtual getShouldUseJbaAccount : ()Z
/*     */     //   297: ifeq -> 389
/*     */     //   300: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   303: ldc 'Loading jba idToken'
/*     */     //   305: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   308: invokestatic getInstance : ()Lcom/intellij/ui/JBAccountInfoService;
/*     */     //   311: dup
/*     */     //   312: ifnull -> 323
/*     */     //   315: invokeinterface getIdToken : ()Ljava/lang/String;
/*     */     //   320: goto -> 325
/*     */     //   323: pop
/*     */     //   324: aconst_null
/*     */     //   325: astore_2
/*     */     //   326: aload_2
/*     */     //   327: dup
/*     */     //   328: ifnull -> 386
/*     */     //   331: astore #4
/*     */     //   333: astore #8
/*     */     //   335: iconst_0
/*     */     //   336: istore #5
/*     */     //   338: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   341: ldc 'Found jba idToken'
/*     */     //   343: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   346: new com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   349: dup
/*     */     //   350: aload #4
/*     */     //   352: ldc2_w 2
/*     */     //   355: invokestatic ofHours : (J)Ljava/time/Duration;
/*     */     //   358: invokevirtual toSeconds : ()J
/*     */     //   361: l2i
/*     */     //   362: aconst_null
/*     */     //   363: ldc ''
/*     */     //   365: ldc 'JBA_ACCESS_TOKEN_TYPE'
/*     */     //   367: aload #4
/*     */     //   369: invokestatic currentTimeMillis : ()J
/*     */     //   372: invokestatic boxLong : (J)Ljava/lang/Long;
/*     */     //   375: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
/*     */     //   378: nop
/*     */     //   379: aload #8
/*     */     //   381: swap
/*     */     //   382: nop
/*     */     //   383: goto -> 388
/*     */     //   386: pop
/*     */     //   387: aconst_null
/*     */     //   388: areturn
/*     */     //   389: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   392: ldc 'Loading token from password safe'
/*     */     //   394: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   397: getstatic com/intellij/ide/passwordSafe/PasswordSafe.Companion : Lcom/intellij/ide/passwordSafe/PasswordSafe$Companion;
/*     */     //   400: invokevirtual getInstance : ()Lcom/intellij/ide/passwordSafe/PasswordSafe;
/*     */     //   403: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.accessTokenCredentialAttribute : Lcom/intellij/credentialStore/CredentialAttributes;
/*     */     //   406: invokevirtual getPassword : (Lcom/intellij/credentialStore/CredentialAttributes;)Ljava/lang/String;
/*     */     //   409: astore_2
/*     */     //   410: aload_2
/*     */     //   411: ifnonnull -> 424
/*     */     //   414: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   417: ldc 'Token not found'
/*     */     //   419: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   422: aconst_null
/*     */     //   423: areturn
/*     */     //   424: astore #8
/*     */     //   426: nop
/*     */     //   427: aload #8
/*     */     //   429: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*     */     //   432: checkcast kotlinx/serialization/json/Json
/*     */     //   435: astore_3
/*     */     //   436: iconst_0
/*     */     //   437: istore #4
/*     */     //   439: aload_3
/*     */     //   440: aload_3
/*     */     //   441: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*     */     //   444: pop
/*     */     //   445: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken$Companion;
/*     */     //   448: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   451: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   454: aload_2
/*     */     //   455: invokevirtual decodeFromString : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   458: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   461: astore_3
/*     */     //   462: goto -> 482
/*     */     //   465: astore #4
/*     */     //   467: aload #8
/*     */     //   469: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   472: aload #4
/*     */     //   474: checkcast java/lang/Throwable
/*     */     //   477: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */     //   480: aconst_null
/*     */     //   481: astore_3
/*     */     //   482: aload_3
/*     */     //   483: astore_2
/*     */     //   484: goto -> 505
/*     */     //   487: astore_3
/*     */     //   488: aload #7
/*     */     //   490: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   493: ldc_w 'Error while loading from password safe'
/*     */     //   496: aload_3
/*     */     //   497: checkcast java/lang/Throwable
/*     */     //   500: invokevirtual error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   503: aconst_null
/*     */     //   504: astore_2
/*     */     //   505: aload_2
/*     */     //   506: putfield _accessToken : Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   509: aload_0
/*     */     //   510: getfield _accessToken : Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   513: areturn
/*     */     //   514: new java/lang/IllegalStateException
/*     */     //   517: dup
/*     */     //   518: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   521: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   524: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #98	-> 60
/*     */     //   #99	-> 93
/*     */     //   #100	-> 100
/*     */     //   #103	-> 105
/*     */     //   #104	-> 111
/*     */     //   #105	-> 122
/*     */     //   #108	-> 130
/*     */     //   #109	-> 139
/*     */     //   #98	-> 183
/*     */     //   #111	-> 230
/*     */     //   #112	-> 242
/*     */     //   #114	-> 250
/*     */     //   #115	-> 254
/*     */     //   #116	-> 256
/*     */     //   #117	-> 266
/*     */     //   #118	-> 267
/*     */     //   #119	-> 269
/*     */     //   #120	-> 271
/*     */     //   #121	-> 273
/*     */     //   #114	-> 279
/*     */     //   #122	-> 282
/*     */     //   #111	-> 286
/*     */     //   #111	-> 290
/*     */     //   #126	-> 293
/*     */     //   #127	-> 300
/*     */     //   #128	-> 308
/*     */     //   #130	-> 326
/*     */     //   #131	-> 338
/*     */     //   #132	-> 346
/*     */     //   #133	-> 350
/*     */     //   #134	-> 352
/*     */     //   #135	-> 362
/*     */     //   #136	-> 363
/*     */     //   #137	-> 365
/*     */     //   #138	-> 367
/*     */     //   #139	-> 369
/*     */     //   #132	-> 375
/*     */     //   #140	-> 378
/*     */     //   #130	-> 382
/*     */     //   #130	-> 386
/*     */     //   #144	-> 389
/*     */     //   #145	-> 397
/*     */     //   #146	-> 410
/*     */     //   #147	-> 414
/*     */     //   #148	-> 422
/*     */     //   #150	-> 424
/*     */     //   #151	-> 429
/*     */     //   #248	-> 439
/*     */     //   #152	-> 465
/*     */     //   #153	-> 469
/*     */     //   #154	-> 480
/*     */     //   #156	-> 487
/*     */     //   #157	-> 490
/*     */     //   #158	-> 503
/*     */     //   #103	-> 506
/*     */     //   #161	-> 509
/*     */     //   #98	-> 514
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	93	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   215	68	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   283	4	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   287	6	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   293	86	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   379	4	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   383	6	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   389	35	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   424	34	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   458	56	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   137	40	2	settingsService	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   326	5	2	token	Ljava/lang/String;
/*     */     //   410	4	2	jsonToken	Ljava/lang/String;
/*     */     //   424	34	2	jsonToken	Ljava/lang/String;
/*     */     //   230	5	3	key	Ljava/lang/String;
/*     */     //   436	22	3	this_$iv	Lkotlinx/serialization/json/Json;
/*     */     //   490	15	3	e	Ljava/lang/Exception;
/*     */     //   335	44	4	it	Ljava/lang/String;
/*     */     //   469	13	4	e	Ljava/lang/Exception;
/*     */     //   239	44	5	it	Ljava/lang/String;
/*     */     //   242	41	6	$i$a$-let-IngrazzioAuthService$getAccessTokenInternal$2	I
/*     */     //   338	41	5	$i$a$-let-IngrazzioAuthService$getAccessTokenInternal$3	I
/*     */     //   439	19	4	$i$f$decodeFromString	I
/*     */     //   0	525	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	464	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	457	9	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   108	177	487	java/lang/Exception
/*     */     //   215	484	487	java/lang/Exception
/*     */     //   426	462	465	java/lang/Exception
/*     */   }
/*     */   
/*     */   private final void setAccessTokenInternal(AccessToken value) {
/*     */     logger.info("Storing token to password safe");
/*     */     Json this_$iv = (Json)Json.Default;
/*     */     int $i$f$encodeToString = 0;
/*     */     this_$iv.getSerializersModule();
/*     */     String jsonToken = (value == null) ? null : this_$iv.encodeToString((SerializationStrategy)AccessToken.Companion.serializer(), value);
/*     */     PasswordSafe.Companion.getInstance().setPassword(accessTokenCredentialAttribute, jsonToken);
/*     */     this._accessToken = value;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String getCurrentJbAUserName() {
/*     */     JBAccountInfoService.getInstance().getUserData();
/*     */     return getShouldUseJbaAccount() ? ((JBAccountInfoService.getInstance() != null && JBAccountInfoService.getInstance().getUserData() != null) ? (JBAccountInfoService.getInstance().getUserData()).presentableName : null) : null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object getAccessToken(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$getAccessToken$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$getAccessToken$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$getAccessToken$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 324, 0 -> 96, 1 -> 128, 2 -> 248, 3 -> 316
/*     */     //   96: aload #5
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_0
/*     */     //   102: aload #6
/*     */     //   104: aload #6
/*     */     //   106: aload_0
/*     */     //   107: putfield L$0 : Ljava/lang/Object;
/*     */     //   110: aload #6
/*     */     //   112: iconst_1
/*     */     //   113: putfield label : I
/*     */     //   116: invokespecial getAccessTokenInternal : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   119: dup
/*     */     //   120: aload #7
/*     */     //   122: if_acmpne -> 144
/*     */     //   125: aload #7
/*     */     //   127: areturn
/*     */     //   128: aload #6
/*     */     //   130: getfield L$0 : Ljava/lang/Object;
/*     */     //   133: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   136: astore_0
/*     */     //   137: aload #5
/*     */     //   139: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   142: aload #5
/*     */     //   144: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   147: dup
/*     */     //   148: ifnonnull -> 154
/*     */     //   151: pop
/*     */     //   152: aconst_null
/*     */     //   153: areturn
/*     */     //   154: astore_2
/*     */     //   155: aload_2
/*     */     //   156: invokevirtual isExpired : ()Z
/*     */     //   159: ifeq -> 283
/*     */     //   162: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   165: ldc_w 'Token expired'
/*     */     //   168: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   171: aload_2
/*     */     //   172: invokevirtual getRefreshToken : ()Ljava/lang/String;
/*     */     //   175: ifnonnull -> 186
/*     */     //   178: aload_0
/*     */     //   179: aconst_null
/*     */     //   180: invokespecial setAccessTokenInternal : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;)V
/*     */     //   183: goto -> 283
/*     */     //   186: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   189: ldc_w 'Token refresh attempt'
/*     */     //   192: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   195: new com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper
/*     */     //   198: dup
/*     */     //   199: aload_0
/*     */     //   200: getfield authLinkChannel : Lkotlinx/coroutines/channels/Channel;
/*     */     //   203: invokespecial <init> : (Lkotlinx/coroutines/channels/Channel;)V
/*     */     //   206: astore_3
/*     */     //   207: aload_0
/*     */     //   208: astore #4
/*     */     //   210: aload_3
/*     */     //   211: aload_2
/*     */     //   212: invokevirtual getRefreshToken : ()Ljava/lang/String;
/*     */     //   215: aload #6
/*     */     //   217: aload #6
/*     */     //   219: aload_0
/*     */     //   220: putfield L$0 : Ljava/lang/Object;
/*     */     //   223: aload #6
/*     */     //   225: aload #4
/*     */     //   227: putfield L$1 : Ljava/lang/Object;
/*     */     //   230: aload #6
/*     */     //   232: iconst_2
/*     */     //   233: putfield label : I
/*     */     //   236: invokevirtual refreshAccessToken : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   239: dup
/*     */     //   240: aload #7
/*     */     //   242: if_acmpne -> 274
/*     */     //   245: aload #7
/*     */     //   247: areturn
/*     */     //   248: aload #6
/*     */     //   250: getfield L$1 : Ljava/lang/Object;
/*     */     //   253: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   256: astore #4
/*     */     //   258: aload #6
/*     */     //   260: getfield L$0 : Ljava/lang/Object;
/*     */     //   263: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   266: astore_0
/*     */     //   267: aload #5
/*     */     //   269: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   272: aload #5
/*     */     //   274: aload #4
/*     */     //   276: swap
/*     */     //   277: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   280: invokespecial setAccessTokenInternal : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;)V
/*     */     //   283: aload_0
/*     */     //   284: aload #6
/*     */     //   286: aload #6
/*     */     //   288: aconst_null
/*     */     //   289: putfield L$0 : Ljava/lang/Object;
/*     */     //   292: aload #6
/*     */     //   294: aconst_null
/*     */     //   295: putfield L$1 : Ljava/lang/Object;
/*     */     //   298: aload #6
/*     */     //   300: iconst_3
/*     */     //   301: putfield label : I
/*     */     //   304: invokespecial getAccessTokenInternal : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   307: dup
/*     */     //   308: aload #7
/*     */     //   310: if_acmpne -> 323
/*     */     //   313: aload #7
/*     */     //   315: areturn
/*     */     //   316: aload #5
/*     */     //   318: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   321: aload #5
/*     */     //   323: areturn
/*     */     //   324: new java/lang/IllegalStateException
/*     */     //   327: dup
/*     */     //   328: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   331: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   334: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #180	-> 60
/*     */     //   #181	-> 101
/*     */     //   #180	-> 125
/*     */     //   #181	-> 144
/*     */     //   #182	-> 155
/*     */     //   #183	-> 162
/*     */     //   #184	-> 171
/*     */     //   #185	-> 178
/*     */     //   #187	-> 186
/*     */     //   #188	-> 195
/*     */     //   #189	-> 207
/*     */     //   #180	-> 245
/*     */     //   #189	-> 274
/*     */     //   #193	-> 283
/*     */     //   #180	-> 313
/*     */     //   #193	-> 323
/*     */     //   #180	-> 324
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	27	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   137	111	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   267	40	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   155	23	2	token	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   186	53	2	token	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   207	32	3	authHelper	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;
/*     */     //   0	335	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	274	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	267	5	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object checkIngrazzioAccess(@NotNull AccessToken token, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$checkIngrazzioAccess$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$checkIngrazzioAccess$1
/*     */     //   11: astore #11
/*     */     //   13: aload #11
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #11
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$checkIngrazzioAccess$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #11
/*     */     //   50: aload #11
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #10
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #12
/*     */     //   62: aload #11
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 369, 0 -> 92, 1 -> 225, 2 -> 301
/*     */     //   92: aload #10
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: new com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy
/*     */     //   100: dup
/*     */     //   101: new com/intellij/ml/llm/matterhorn/core/llm/EmptyAICache
/*     */     //   104: dup
/*     */     //   105: invokespecial <init> : ()V
/*     */     //   108: checkcast com/intellij/ml/llm/matterhorn/core/llm/AICache
/*     */     //   111: new com/intellij/ml/llm/matterhorn/InMemoryCaches
/*     */     //   114: dup
/*     */     //   115: invokespecial <init> : ()V
/*     */     //   118: checkcast com/intellij/ml/llm/matterhorn/MatterhornCaches
/*     */     //   121: getstatic com/intellij/ml/llm/matterhorn/core/llm/DelayStrategy$NoAttempts.INSTANCE : Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy$NoAttempts;
/*     */     //   124: checkcast com/intellij/ml/llm/matterhorn/core/llm/DelayStrategy
/*     */     //   127: getstatic com/intellij/ml/llm/matterhorn/core/llm/DelayStrategy$NoAttempts.INSTANCE : Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy$NoAttempts;
/*     */     //   130: checkcast com/intellij/ml/llm/matterhorn/core/llm/DelayStrategy
/*     */     //   133: aload_1
/*     */     //   134: aconst_null
/*     */     //   135: bipush #32
/*     */     //   137: aconst_null
/*     */     //   138: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   141: astore_3
/*     */     //   142: new com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*     */     //   145: dup
/*     */     //   146: ldc ''
/*     */     //   148: ldc_w 'Say Hello!'
/*     */     //   151: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   154: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   157: aconst_null
/*     */     //   158: aconst_null
/*     */     //   159: aconst_null
/*     */     //   160: bipush #28
/*     */     //   162: aconst_null
/*     */     //   163: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   166: astore #4
/*     */     //   168: nop
/*     */     //   169: aload_3
/*     */     //   170: aload #4
/*     */     //   172: astore #8
/*     */     //   174: astore #7
/*     */     //   176: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*     */     //   179: ldc_w 'access_checker'
/*     */     //   182: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
/*     */     //   185: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   188: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   191: aload #11
/*     */     //   193: aload #11
/*     */     //   195: aload #7
/*     */     //   197: putfield L$0 : Ljava/lang/Object;
/*     */     //   200: aload #11
/*     */     //   202: aload #8
/*     */     //   204: putfield L$1 : Ljava/lang/Object;
/*     */     //   207: aload #11
/*     */     //   209: iconst_1
/*     */     //   210: putfield label : I
/*     */     //   213: invokevirtual getDefaultModel : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   216: dup
/*     */     //   217: aload #12
/*     */     //   219: if_acmpne -> 253
/*     */     //   222: aload #12
/*     */     //   224: areturn
/*     */     //   225: aload #11
/*     */     //   227: getfield L$1 : Ljava/lang/Object;
/*     */     //   230: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*     */     //   233: astore #8
/*     */     //   235: aload #11
/*     */     //   237: getfield L$0 : Ljava/lang/Object;
/*     */     //   240: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy
/*     */     //   243: astore #7
/*     */     //   245: nop
/*     */     //   246: aload #10
/*     */     //   248: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   251: aload #10
/*     */     //   253: astore #9
/*     */     //   255: aload #7
/*     */     //   257: aload #8
/*     */     //   259: aload #9
/*     */     //   261: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   264: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   269: aload #11
/*     */     //   271: aload #11
/*     */     //   273: aconst_null
/*     */     //   274: putfield L$0 : Ljava/lang/Object;
/*     */     //   277: aload #11
/*     */     //   279: aconst_null
/*     */     //   280: putfield L$1 : Ljava/lang/Object;
/*     */     //   283: aload #11
/*     */     //   285: iconst_2
/*     */     //   286: putfield label : I
/*     */     //   289: invokevirtual sendChat : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   292: dup
/*     */     //   293: aload #12
/*     */     //   295: if_acmpne -> 309
/*     */     //   298: aload #12
/*     */     //   300: areturn
/*     */     //   301: nop
/*     */     //   302: aload #10
/*     */     //   304: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   307: aload #10
/*     */     //   309: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   312: astore #5
/*     */     //   314: aload #5
/*     */     //   316: invokevirtual getOutputTokens : ()J
/*     */     //   319: lconst_0
/*     */     //   320: lcmp
/*     */     //   321: ifle -> 328
/*     */     //   324: iconst_1
/*     */     //   325: goto -> 329
/*     */     //   328: iconst_0
/*     */     //   329: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   332: areturn
/*     */     //   333: astore #6
/*     */     //   335: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   338: aload #6
/*     */     //   340: checkcast java/lang/Throwable
/*     */     //   343: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */     //   346: iconst_1
/*     */     //   347: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   350: areturn
/*     */     //   351: astore #6
/*     */     //   353: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   356: aload #6
/*     */     //   358: checkcast java/lang/Throwable
/*     */     //   361: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */     //   364: iconst_0
/*     */     //   365: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   368: areturn
/*     */     //   369: new java/lang/IllegalStateException
/*     */     //   372: dup
/*     */     //   373: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   376: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   379: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #196	-> 60
/*     */     //   #197	-> 97
/*     */     //   #198	-> 142
/*     */     //   #199	-> 168
/*     */     //   #200	-> 169
/*     */     //   #196	-> 222
/*     */     //   #200	-> 253
/*     */     //   #196	-> 298
/*     */     //   #201	-> 314
/*     */     //   #202	-> 333
/*     */     //   #204	-> 335
/*     */     //   #205	-> 346
/*     */     //   #206	-> 351
/*     */     //   #208	-> 353
/*     */     //   #209	-> 364
/*     */     //   #196	-> 369
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	45	1	token	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   142	74	3	proxy	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy;
/*     */     //   168	48	4	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   314	14	5	output	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   335	16	6	e	Lcom/intellij/ml/llm/matterhorn/LLMPaymentRequiredException;
/*     */     //   353	16	6	e	Ljava/lang/Exception;
/*     */     //   0	380	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	319	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	312	10	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   168	216	333	com/intellij/ml/llm/matterhorn/LLMPaymentRequiredException
/*     */     //   168	216	351	java/lang/Exception
/*     */     //   245	292	333	com/intellij/ml/llm/matterhorn/LLMPaymentRequiredException
/*     */     //   245	292	351	java/lang/Exception
/*     */     //   301	333	333	com/intellij/ml/llm/matterhorn/LLMPaymentRequiredException
/*     */     //   301	333	351	java/lang/Exception
/*     */   }
/*     */   
/*     */   private static final Unit checkIngrazzioAccess$lambda$2(CustomArtifactEvent it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object startAndAwaitAuthorizationProcess(boolean openBrowser, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$startAndAwaitAuthorizationProcess$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$startAndAwaitAuthorizationProcess$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$startAndAwaitAuthorizationProcess$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 355, 0 -> 100, 1 -> 169, 2 -> 220, 3 -> 299, 4 -> 343
/*     */     //   100: aload #4
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_0
/*     */     //   106: invokevirtual getShouldUseJbaAccount : ()Z
/*     */     //   109: ifeq -> 232
/*     */     //   112: invokestatic getInstance : ()Lcom/intellij/ui/JBAccountInfoService;
/*     */     //   115: dup
/*     */     //   116: ifnull -> 192
/*     */     //   119: getstatic com/intellij/ui/JBAccountInfoService$LoginMode.AUTO : Lcom/intellij/ui/JBAccountInfoService$LoginMode;
/*     */     //   122: invokeinterface startLoginSession : (Lcom/intellij/ui/JBAccountInfoService$LoginMode;)Lcom/intellij/ui/JBAccountInfoService$LoginSession;
/*     */     //   127: dup
/*     */     //   128: ifnull -> 192
/*     */     //   131: invokeinterface onCompleted : ()Ljava/util/concurrent/CompletableFuture;
/*     */     //   136: dup
/*     */     //   137: ifnull -> 192
/*     */     //   140: checkcast java/util/concurrent/CompletionStage
/*     */     //   143: aload #5
/*     */     //   145: aload #5
/*     */     //   147: aload_0
/*     */     //   148: putfield L$0 : Ljava/lang/Object;
/*     */     //   151: aload #5
/*     */     //   153: iconst_1
/*     */     //   154: putfield label : I
/*     */     //   157: invokestatic await : (Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   160: dup
/*     */     //   161: aload #6
/*     */     //   163: if_acmpne -> 185
/*     */     //   166: aload #6
/*     */     //   168: areturn
/*     */     //   169: aload #5
/*     */     //   171: getfield L$0 : Ljava/lang/Object;
/*     */     //   174: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   177: astore_0
/*     */     //   178: aload #4
/*     */     //   180: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   183: aload #4
/*     */     //   185: checkcast com/intellij/ui/JBAccountInfoService$LoginResult
/*     */     //   188: pop
/*     */     //   189: goto -> 193
/*     */     //   192: pop
/*     */     //   193: aload_0
/*     */     //   194: aload #5
/*     */     //   196: aload #5
/*     */     //   198: aconst_null
/*     */     //   199: putfield L$0 : Ljava/lang/Object;
/*     */     //   202: aload #5
/*     */     //   204: iconst_2
/*     */     //   205: putfield label : I
/*     */     //   208: invokespecial getAccessTokenInternal : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   211: dup
/*     */     //   212: aload #6
/*     */     //   214: if_acmpne -> 227
/*     */     //   217: aload #6
/*     */     //   219: areturn
/*     */     //   220: aload #4
/*     */     //   222: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   225: aload #4
/*     */     //   227: dup
/*     */     //   228: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   231: areturn
/*     */     //   232: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   235: ldc_w 'Requesting browser for authorization'
/*     */     //   238: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   241: aload_0
/*     */     //   242: invokespecial getAuthHelper : ()Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;
/*     */     //   245: iload_1
/*     */     //   246: ifeq -> 253
/*     */     //   249: iconst_1
/*     */     //   250: goto -> 254
/*     */     //   253: iconst_0
/*     */     //   254: new com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1
/*     */     //   257: dup
/*     */     //   258: aload_0
/*     */     //   259: aconst_null
/*     */     //   260: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;Lkotlin/coroutines/Continuation;)V
/*     */     //   263: checkcast kotlin/jvm/functions/Function2
/*     */     //   266: invokevirtual generateAuthLinkAndWaitForAccessCode : (ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   269: astore_3
/*     */     //   270: aload_3
/*     */     //   271: aload #5
/*     */     //   273: aload #5
/*     */     //   275: aload_0
/*     */     //   276: putfield L$0 : Ljava/lang/Object;
/*     */     //   279: aload #5
/*     */     //   281: iconst_3
/*     */     //   282: putfield label : I
/*     */     //   285: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   290: dup
/*     */     //   291: aload #6
/*     */     //   293: if_acmpne -> 315
/*     */     //   296: aload #6
/*     */     //   298: areturn
/*     */     //   299: aload #5
/*     */     //   301: getfield L$0 : Ljava/lang/Object;
/*     */     //   304: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   307: astore_0
/*     */     //   308: aload #4
/*     */     //   310: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   313: aload #4
/*     */     //   315: pop
/*     */     //   316: aload_0
/*     */     //   317: aload #5
/*     */     //   319: aload #5
/*     */     //   321: aconst_null
/*     */     //   322: putfield L$0 : Ljava/lang/Object;
/*     */     //   325: aload #5
/*     */     //   327: iconst_4
/*     */     //   328: putfield label : I
/*     */     //   331: invokespecial getAccessTokenInternal : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   334: dup
/*     */     //   335: aload #6
/*     */     //   337: if_acmpne -> 350
/*     */     //   340: aload #6
/*     */     //   342: areturn
/*     */     //   343: aload #4
/*     */     //   345: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   348: aload #4
/*     */     //   350: dup
/*     */     //   351: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   354: areturn
/*     */     //   355: new java/lang/IllegalStateException
/*     */     //   358: dup
/*     */     //   359: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   362: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   365: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #213	-> 60
/*     */     //   #214	-> 105
/*     */     //   #215	-> 112
/*     */     //   #213	-> 166
/*     */     //   #215	-> 185
/*     */     //   #216	-> 193
/*     */     //   #213	-> 217
/*     */     //   #216	-> 227
/*     */     //   #219	-> 232
/*     */     //   #220	-> 241
/*     */     //   #232	-> 270
/*     */     //   #213	-> 296
/*     */     //   #233	-> 315
/*     */     //   #213	-> 340
/*     */     //   #233	-> 350
/*     */     //   #213	-> 355
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	64	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   178	33	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   232	67	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   308	26	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */     //   105	7	1	openBrowser	Z
/*     */     //   232	21	1	openBrowser	Z
/*     */     //   270	20	3	deferred	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   0	366	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	305	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	298	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "IngrazzioAuthService.kt", l = {200, 200}, i = {}, s = {}, n = {}, m = "checkIngrazzioAccess", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.IngrazzioAuthService")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class IngrazzioAuthService$checkIngrazzioAccess$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     IngrazzioAuthService$checkIngrazzioAccess$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return IngrazzioAuthService.this.checkIngrazzioAccess(null, (Continuation<? super Boolean>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "IngrazzioAuthService.kt", l = {181, 189, 193}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"this", "this"}, m = "getAccessToken", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.IngrazzioAuthService")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class IngrazzioAuthService$getAccessToken$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     IngrazzioAuthService$getAccessToken$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return IngrazzioAuthService.this.getAccessToken((Continuation<? super AccessToken>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "IngrazzioAuthService.kt", l = {109}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getAccessTokenInternal", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.IngrazzioAuthService")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class IngrazzioAuthService$getAccessTokenInternal$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     IngrazzioAuthService$getAccessTokenInternal$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return IngrazzioAuthService.this.getAccessTokenInternal((Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "IngrazzioAuthService.kt", l = {215, 216, 232, 233}, i = {0, 2}, s = {"L$0", "L$0"}, n = {"this", "this"}, m = "startAndAwaitAuthorizationProcess", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.IngrazzioAuthService")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class IngrazzioAuthService$startAndAwaitAuthorizationProcess$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     IngrazzioAuthService$startAndAwaitAuthorizationProcess$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return IngrazzioAuthService.this.startAndAwaitAuthorizationProcess(false, (Continuation<? super AccessToken>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "IngrazzioAuthService.kt", l = {223}, i = {0}, s = {"L$0"}, n = {"token"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\016\n\000\n\002\030\002\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n"}, d2 = {"<anonymous>", "", "token", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;"})
/*     */   static final class IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1 extends SuspendLambda implements Function2<AccessToken, Continuation<? super String>, Object> {
/*     */     int label;
/*     */     
/*     */     IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_3
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 121, 0 -> 32, 1 -> 83
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */       //   43: astore_2
/*     */       //   44: nop
/*     */       //   45: aload_2
/*     */       //   46: ifnonnull -> 54
/*     */       //   49: ldc 'https://lp.jetbrains.com/junie-failed/'
/*     */       //   51: goto -> 120
/*     */       //   54: aload_0
/*     */       //   55: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */       //   58: aload_2
/*     */       //   59: aload_0
/*     */       //   60: checkcast kotlin/coroutines/Continuation
/*     */       //   63: aload_0
/*     */       //   64: aload_2
/*     */       //   65: putfield L$0 : Ljava/lang/Object;
/*     */       //   68: aload_0
/*     */       //   69: iconst_1
/*     */       //   70: putfield label : I
/*     */       //   73: invokevirtual checkIngrazzioAccess : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   76: dup
/*     */       //   77: aload_3
/*     */       //   78: if_acmpne -> 96
/*     */       //   81: aload_3
/*     */       //   82: areturn
/*     */       //   83: aload_0
/*     */       //   84: getfield L$0 : Ljava/lang/Object;
/*     */       //   87: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */       //   90: astore_2
/*     */       //   91: aload_1
/*     */       //   92: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   95: aload_1
/*     */       //   96: checkcast java/lang/Boolean
/*     */       //   99: invokevirtual booleanValue : ()Z
/*     */       //   102: ifeq -> 118
/*     */       //   105: aload_0
/*     */       //   106: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
/*     */       //   109: aload_2
/*     */       //   110: invokestatic access$setAccessTokenInternal : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;)V
/*     */       //   113: ldc 'https://lp.jetbrains.com/junie-success'
/*     */       //   115: goto -> 120
/*     */       //   118: ldc 'https://lp.jetbrains.com/junie-join-access-waitlist/'
/*     */       //   120: areturn
/*     */       //   121: new java/lang/IllegalStateException
/*     */       //   124: dup
/*     */       //   125: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   127: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   130: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #220	-> 3
/*     */       //   #221	-> 44
/*     */       //   #222	-> 45
/*     */       //   #223	-> 54
/*     */       //   #220	-> 81
/*     */       //   #223	-> 96
/*     */       //   #224	-> 105
/*     */       //   #225	-> 113
/*     */       //   #228	-> 118
/*     */       //   #229	-> 120
/*     */       //   #220	-> 121
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	39	2	token	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */       //   91	22	2	token	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */       //   0	131	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1;
/*     */       //   36	85	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1> $completion) {
/*     */       IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1 ingrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1 = new IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1($completion);
/*     */       ingrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1.L$0 = value;
/*     */       return (Continuation<Unit>)ingrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(AccessToken p1, Continuation<?> p2) {
/*     */       return ((IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void clearAccessToken() {
/*     */     logger.info("Clearing access token");
/*     */     setAccessTokenInternal(null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\ingrazzio\IngrazzioAuthService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */