/*     */ package ai.grazie.utils.http;
/*     */ import ai.grazie.model.cloud.HttpMethod;
/*     */ import io.ktor.client.HttpClient;
/*     */ import io.ktor.client.plugins.HttpTimeoutConfig;
/*     */ import io.ktor.client.plugins.api.OnResponseContext;
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import io.ktor.http.HttpMethod;
/*     */ import java.util.Collection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000J\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\013\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\004\032\n\020\r\032\0020\016*\0020\017\032\032\020\020\032\0020\021*\0020\0222\006\020\023\032\0020\024H@¢\006\002\020\025\032\f\020\026\032\0020\016*\0020\027H\002\032(\020\030\032\0020\031*\0020\0312\b\b\002\020\032\032\0020\0332\b\b\002\020\034\032\0020\0332\b\b\002\020\035\032\0020\033\032\n\020\036\032\0020\031*\0020\031\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004\"\025\020\005\032\0020\006*\0020\0078F¢\006\006\032\004\b\b\020\t\"\025\020\n\032\0020\007*\0020\0068F¢\006\006\032\004\b\013\020\f¨\006\037"}, d2 = {"responseHeadersLoggerPlugin", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lai/grazie/utils/http/ResponseHeadersLoggerPluginConfig;", "getResponseHeadersLoggerPlugin", "()Lio/ktor/client/plugins/api/ClientPlugin;", "grazieMethod", "Lai/grazie/model/cloud/HttpMethod;", "Lio/ktor/http/HttpMethod;", "getGrazieMethod", "(Lio/ktor/http/HttpMethod;)Lai/grazie/model/cloud/HttpMethod;", "ktorMethod", "getKtorMethod", "(Lai/grazie/model/cloud/HttpMethod;)Lio/ktor/http/HttpMethod;", "isJsonContentType", "", "Lio/ktor/http/Headers;", "of", "Lai/grazie/model/cloud/exceptions/HttpExceptionBase;", "Lai/grazie/model/cloud/exceptions/HttpExceptionBase$Companion;", "response", "Lio/ktor/client/statement/HttpResponse;", "(Lai/grazie/model/cloud/exceptions/HttpExceptionBase$Companion;Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startsWithJsonToken", "", "withExtendedTimeout", "Lio/ktor/client/HttpClient;", "requestTimeout", "", "connectTimeout", "socketTimeout", "withOneMinuteTimeout", "utils-ktor"})
/*     */ @SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nai/grazie/utils/http/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
/*     */ public final class UtilsKt {
/*     */   @NotNull
/*     */   public static final HttpMethod getKtorMethod(@NotNull HttpMethod $this$ktorMethod) {
/*  22 */     Intrinsics.checkNotNullParameter($this$ktorMethod, "<this>"); switch (WhenMappings.$EnumSwitchMapping$0[$this$ktorMethod.ordinal()]) { case 1: 
/*     */       case 2: 
/*     */       case 3: 
/*     */       case 4: 
/*     */       case 5: 
/*     */       case 6: 
/*     */       case 7:
/*  29 */        }  throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final HttpMethod getGrazieMethod(@NotNull HttpMethod $this$grazieMethod) {
/*  35 */     Intrinsics.checkNotNullParameter($this$grazieMethod, "<this>"); HttpMethod httpMethod = $this$grazieMethod;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  42 */     if (Intrinsics.areEqual(httpMethod, HttpMethod.Companion.getOptions())) {  } else { throw new IllegalStateException(
/*     */           
/*  44 */           "Unknown HttpMethod. Add a new one to `ai.grazie.model.cloud.HttpMethod`".toString()); }
/*     */     
/*     */     return Intrinsics.areEqual(httpMethod, HttpMethod.Companion.getGet()) ? HttpMethod.Get : (Intrinsics.areEqual(httpMethod, HttpMethod.Companion.getPost()) ? HttpMethod.Post : (Intrinsics.areEqual(httpMethod, HttpMethod.Companion.getPut()) ? HttpMethod.Put : (Intrinsics.areEqual(httpMethod, HttpMethod.Companion.getPatch()) ? HttpMethod.Patch : (Intrinsics.areEqual(httpMethod, HttpMethod.Companion.getDelete()) ? HttpMethod.Delete : (Intrinsics.areEqual(httpMethod, HttpMethod.Companion.getHead()) ? HttpMethod.Head : (HttpMethod)"JD-Core does not support Kotlin")))));
/*     */   }
/*     */   public static final boolean isJsonContentType(@NotNull Headers $this$isJsonContentType) {
/*  49 */     Intrinsics.checkNotNullParameter($this$isJsonContentType, "<this>"); if ($this$isJsonContentType.get(HttpHeaders.INSTANCE.getContentType()) != null) { String[] arrayOfString = new String[1]; arrayOfString[0] = ";"; if (StringsKt.split$default($this$isJsonContentType.get(HttpHeaders.INSTANCE.getContentType()), arrayOfString, false, 0, 6, null) != null); }  StringsKt.split$default($this$isJsonContentType.get(HttpHeaders.INSTANCE.getContentType()), arrayOfString, false, 0, 6, null).contains(ContentType.Application.INSTANCE.getJson().toString()); return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  58 */   private static final ClientPlugin<ResponseHeadersLoggerPluginConfig> responseHeadersLoggerPlugin = CreatePluginUtilsKt.createClientPlugin("ResponseHeaderLoggerPlugin", UtilsKt$responseHeadersLoggerPlugin$1.INSTANCE, UtilsKt$responseHeadersLoggerPlugin$2.INSTANCE); @NotNull public static final ClientPlugin<ResponseHeadersLoggerPluginConfig> getResponseHeadersLoggerPlugin() { return responseHeadersLoggerPlugin; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "Lai/grazie/utils/http/ResponseHeadersLoggerPluginConfig;", "invoke"})
/*  59 */   static final class UtilsKt$responseHeadersLoggerPlugin$2 extends Lambda implements Function1<ClientPluginBuilder<ResponseHeadersLoggerPluginConfig>, Unit> { public static final UtilsKt$responseHeadersLoggerPlugin$2 INSTANCE = new UtilsKt$responseHeadersLoggerPlugin$2(); public final void invoke(ClientPluginBuilder $this$createClientPlugin) { Intrinsics.checkNotNullParameter($this$createClientPlugin, "$this$createClientPlugin"); List<String> headerNames = ((ResponseHeadersLoggerPluginConfig)$this$createClientPlugin.getPluginConfig()).getHeaderNames();
/*  60 */       if (headerNames.isEmpty()) {
/*     */         return;
/*     */       }
/*     */       
/*  64 */       MPPLogger logger = ((ResponseHeadersLoggerPluginConfig)$this$createClientPlugin.getPluginConfig()).getLogger();
/*     */       
/*  66 */       $this$createClientPlugin.onResponse(new Function3<OnResponseContext, HttpResponse, Continuation<? super Unit>, Object>(headerNames, logger, null) { int label; public final Object invokeSuspend(Object $result) { HttpResponse response; String message; Iterable<String> $this$filter$iv; Iterable $this$map$iv; int $i$f$filter, $i$f$map; Iterable<String> iterable1; Iterable $this$filterTo$iv$iv; Collection<Object> collection; Collection<Pair> destination$iv$iv; int $i$f$filterTo, $i$f$mapTo; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); response = (HttpResponse)this.L$0;
/*  67 */                   $this$filter$iv = this.$headerNames;
/*  68 */                   $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 122 */                   iterable1 = $this$filter$iv; collection = new ArrayList(); $i$f$filterTo = 0;
/* 123 */                   for (String element$iv$iv : iterable1) { String it = element$iv$iv; int $i$a$-filter-UtilsKt$responseHeadersLoggerPlugin$2$1$message$1 = 0; if (response.getHeaders().contains(it)) collection.add(element$iv$iv);  }
/* 124 */                    $this$map$iv = collection; $i$f$map = 0;
/* 125 */                   $this$filterTo$iv$iv = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 126 */                   for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 127 */                     String str = (String)item$iv$iv; Collection<Pair> collection1 = destination$iv$iv; int $i$a$-map-UtilsKt$responseHeadersLoggerPlugin$2$1$message$2 = 0; collection1.add(TuplesKt.to(str, response.getHeaders().get(str)));
/* 128 */                   }  message = CollectionsKt.joinToString$default(destination$iv$iv, null, null, null, 0, null, UtilsKt$responseHeadersLoggerPlugin$2$1$message$3.INSTANCE, 31, null);
/*     */                   if (!StringsKt.isBlank(message))
/*     */                     this.$logger.info(new Function0<String>(message) {
/*     */                           public final String invoke() {
/*     */                             return this.$message;
/*     */                           }
/*     */                         }); 
/*     */                   return Unit.INSTANCE; }
/*     */               
/*     */               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */             
/*     */             public final Object invoke(OnResponseContext p1, HttpResponse p2, Continuation<? super null> p3) {
/*     */               Function3<OnResponseContext, HttpResponse, Continuation<? super Unit>, Object> function3 = new Function3<>(this.$headerNames, this.$logger, p3);
/*     */               function3.L$0 = p2;
/*     */               return function3.invokeSuspend(Unit.INSTANCE);
/*     */             }
/*     */             
/*     */             @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\r\n\000\n\002\030\002\n\002\020\016\n\000\020\000\032\0020\0012\024\020\002\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke"})
/*     */             static final class UtilsKt$responseHeadersLoggerPlugin$2$1$message$3 extends Lambda implements Function1<Pair<? extends String, ? extends String>, CharSequence> {
/*     */               public static final UtilsKt$responseHeadersLoggerPlugin$2$1$message$3 INSTANCE = new UtilsKt$responseHeadersLoggerPlugin$2$1$message$3();
/*     */               
/*     */               UtilsKt$responseHeadersLoggerPlugin$2$1$message$3() {
/*     */                 super(1);
/*     */               }
/*     */               
/*     */               public final CharSequence invoke(Pair it) {
/*     */                 Intrinsics.checkNotNullParameter(it, "it");
/*     */                 return "" + it.getFirst() + " = " + it.getFirst();
/*     */               }
/*     */             } }
/*     */         ); }
/*     */ 
/*     */     
/*     */     UtilsKt$responseHeadersLoggerPlugin$2() {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final HttpClient withOneMinuteTimeout(@NotNull HttpClient $this$withOneMinuteTimeout) {
/*     */     Intrinsics.checkNotNullParameter($this$withOneMinuteTimeout, "<this>");
/*     */     return withExtendedTimeout($this$withOneMinuteTimeout, 60000L, 60000L, 60000L);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final HttpClient withExtendedTimeout(@NotNull HttpClient $this$withExtendedTimeout, long requestTimeout, long connectTimeout, long socketTimeout) {
/*     */     Intrinsics.checkNotNullParameter($this$withExtendedTimeout, "<this>");
/*     */     return $this$withExtendedTimeout.config(new UtilsKt$withExtendedTimeout$1(requestTimeout, connectTimeout, socketTimeout));
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "utils.kt", l = {99}, i = {0}, s = {"L$0"}, n = {"response"}, m = "of", c = "ai.grazie.utils.http.UtilsKt")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class UtilsKt$of$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     UtilsKt$of$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return UtilsKt.of(null, null, (Continuation<? super HttpExceptionBase>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\006\022\002\b\0030\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "invoke"})
/*     */   static final class UtilsKt$withExtendedTimeout$1 extends Lambda implements Function1<HttpClientConfig<?>, Unit> {
/*     */     public final void invoke(HttpClientConfig $this$config) {
/*     */       Intrinsics.checkNotNullParameter($this$config, "$this$config");
/*     */       $this$config.install((HttpClientPlugin)HttpTimeoutKt.getHttpTimeout(), new Function1<HttpTimeoutConfig, Unit>(this.$requestTimeout, this.$connectTimeout, this.$socketTimeout) {
/*     */             public final void invoke(HttpTimeoutConfig $this$install) {
/*     */               Intrinsics.checkNotNullParameter($this$install, "$this$install");
/*     */               $this$install.setRequestTimeoutMillis(Long.valueOf(this.$requestTimeout));
/*     */               $this$install.setConnectTimeoutMillis(Long.valueOf(this.$connectTimeout));
/*     */               $this$install.setSocketTimeoutMillis(Long.valueOf(this.$socketTimeout));
/*     */             }
/*     */           });
/*     */     }
/*     */     
/*     */     UtilsKt$withExtendedTimeout$1(long $requestTimeout, long $connectTimeout, long $socketTimeout) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object of(@NotNull HttpExceptionBase.Companion paramCompanion, @NotNull HttpResponse response, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof ai/grazie/utils/http/UtilsKt$of$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast ai/grazie/utils/http/UtilsKt$of$1
/*     */     //   11: astore #16
/*     */     //   13: aload #16
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #16
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 49
/*     */     //   39: new ai/grazie/utils/http/UtilsKt$of$1
/*     */     //   42: dup
/*     */     //   43: aload_2
/*     */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   47: astore #16
/*     */     //   49: aload #16
/*     */     //   51: getfield result : Ljava/lang/Object;
/*     */     //   54: astore #15
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #17
/*     */     //   61: aload #16
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 383, 0 -> 88, 1 -> 124
/*     */     //   88: aload #15
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: nop
/*     */     //   94: aload_1
/*     */     //   95: aconst_null
/*     */     //   96: aload #16
/*     */     //   98: iconst_1
/*     */     //   99: aconst_null
/*     */     //   100: aload #16
/*     */     //   102: aload_1
/*     */     //   103: putfield L$0 : Ljava/lang/Object;
/*     */     //   106: aload #16
/*     */     //   108: iconst_1
/*     */     //   109: putfield label : I
/*     */     //   112: invokestatic bodyAsText$default : (Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   115: dup
/*     */     //   116: aload #17
/*     */     //   118: if_acmpne -> 141
/*     */     //   121: aload #17
/*     */     //   123: areturn
/*     */     //   124: aload #16
/*     */     //   126: getfield L$0 : Ljava/lang/Object;
/*     */     //   129: checkcast io/ktor/client/statement/HttpResponse
/*     */     //   132: astore_1
/*     */     //   133: nop
/*     */     //   134: aload #15
/*     */     //   136: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   139: aload #15
/*     */     //   141: checkcast java/lang/String
/*     */     //   144: astore #4
/*     */     //   146: goto -> 155
/*     */     //   149: astore #5
/*     */     //   151: ldc '<body failed decoding>'
/*     */     //   153: astore #4
/*     */     //   155: aload #4
/*     */     //   157: astore_3
/*     */     //   158: aload_1
/*     */     //   159: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */     //   162: invokevirtual getValue : ()I
/*     */     //   165: istore #4
/*     */     //   167: getstatic ai/grazie/model/cloud/HeaderCollection.Companion : Lai/grazie/model/cloud/HeaderCollection$Companion;
/*     */     //   170: aload_1
/*     */     //   171: invokevirtual getHeaders : ()Lio/ktor/http/Headers;
/*     */     //   174: checkcast io/ktor/util/StringValues
/*     */     //   177: invokestatic toMap : (Lio/ktor/util/StringValues;)Ljava/util/Map;
/*     */     //   180: invokestatic of : (Lai/grazie/model/cloud/HeaderCollection$Companion;Ljava/util/Map;)Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   183: astore #5
/*     */     //   185: aload_1
/*     */     //   186: invokevirtual getHeaders : ()Lio/ktor/http/Headers;
/*     */     //   189: invokestatic isJsonContentType : (Lio/ktor/http/Headers;)Z
/*     */     //   192: ifeq -> 256
/*     */     //   195: aload_3
/*     */     //   196: invokestatic startsWithJsonToken : (Ljava/lang/String;)Z
/*     */     //   199: ifeq -> 256
/*     */     //   202: nop
/*     */     //   203: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*     */     //   206: getstatic ai/grazie/model/cloud/exceptions/ExceptionBody.Companion : Lai/grazie/model/cloud/exceptions/ExceptionBody$Companion;
/*     */     //   209: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   212: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   215: aload_3
/*     */     //   216: invokevirtual decodeFromString : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   219: checkcast ai/grazie/model/cloud/exceptions/ExceptionBody
/*     */     //   222: aload #5
/*     */     //   224: invokevirtual toException : (Lai/grazie/model/cloud/HeaderCollection;)Lai/grazie/model/cloud/exceptions/JsonBodyException;
/*     */     //   227: astore #6
/*     */     //   229: goto -> 248
/*     */     //   232: astore #7
/*     */     //   234: new ai/grazie/model/cloud/exceptions/JsonBodyException$Unknown
/*     */     //   237: dup
/*     */     //   238: aload_3
/*     */     //   239: iload #4
/*     */     //   241: aconst_null
/*     */     //   242: aload #5
/*     */     //   244: invokespecial <init> : (Ljava/lang/String;ILjava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V
/*     */     //   247: athrow
/*     */     //   248: aload #6
/*     */     //   250: checkcast ai/grazie/model/cloud/exceptions/HttpExceptionBase
/*     */     //   253: goto -> 382
/*     */     //   256: aload_1
/*     */     //   257: invokevirtual getCall : ()Lio/ktor/client/call/HttpClientCall;
/*     */     //   260: invokevirtual getRequest : ()Lio/ktor/client/request/HttpRequest;
/*     */     //   263: invokeinterface getUrl : ()Lio/ktor/http/Url;
/*     */     //   268: astore #6
/*     */     //   270: aload #6
/*     */     //   272: iload #4
/*     */     //   274: aload_3
/*     */     //   275: astore #8
/*     */     //   277: aload #8
/*     */     //   279: astore #9
/*     */     //   281: istore #13
/*     */     //   283: astore #12
/*     */     //   285: iconst_0
/*     */     //   286: istore #10
/*     */     //   288: aload #9
/*     */     //   290: checkcast java/lang/CharSequence
/*     */     //   293: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   296: ifne -> 303
/*     */     //   299: iconst_1
/*     */     //   300: goto -> 304
/*     */     //   303: iconst_0
/*     */     //   304: nop
/*     */     //   305: istore #14
/*     */     //   307: aload #12
/*     */     //   309: iload #13
/*     */     //   311: iload #14
/*     */     //   313: ifeq -> 321
/*     */     //   316: aload #8
/*     */     //   318: goto -> 322
/*     */     //   321: aconst_null
/*     */     //   322: dup
/*     */     //   323: ifnull -> 355
/*     */     //   326: astore #10
/*     */     //   328: istore #13
/*     */     //   330: astore #12
/*     */     //   332: iconst_0
/*     */     //   333: istore #11
/*     */     //   335: aload #10
/*     */     //   337: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   342: astore #14
/*     */     //   344: aload #12
/*     */     //   346: iload #13
/*     */     //   348: aload #14
/*     */     //   350: nop
/*     */     //   351: dup
/*     */     //   352: ifnonnull -> 359
/*     */     //   355: pop
/*     */     //   356: ldc_w ''
/*     */     //   359: <illegal opcode> makeConcatWithConstants : (Lio/ktor/http/Url;ILjava/lang/String;)Ljava/lang/String;
/*     */     //   364: astore #7
/*     */     //   366: getstatic ai/grazie/model/cloud/exceptions/HTTPStatusException.Companion : Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;
/*     */     //   369: iload #4
/*     */     //   371: aload #5
/*     */     //   373: aload #7
/*     */     //   375: aconst_null
/*     */     //   376: invokevirtual from : (ILai/grazie/model/cloud/HeaderCollection;Ljava/lang/String;Ljava/lang/Throwable;)Lai/grazie/model/cloud/exceptions/HTTPStatusException;
/*     */     //   379: checkcast ai/grazie/model/cloud/exceptions/HttpExceptionBase
/*     */     //   382: areturn
/*     */     //   383: new java/lang/IllegalStateException
/*     */     //   386: dup
/*     */     //   387: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   390: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   393: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #97	-> 59
/*     */     //   #98	-> 93
/*     */     //   #99	-> 94
/*     */     //   #97	-> 121
/*     */     //   #99	-> 141
/*     */     //   #100	-> 149
/*     */     //   #101	-> 151
/*     */     //   #98	-> 155
/*     */     //   #103	-> 158
/*     */     //   #104	-> 167
/*     */     //   #105	-> 185
/*     */     //   #106	-> 202
/*     */     //   #107	-> 203
/*     */     //   #108	-> 232
/*     */     //   #109	-> 234
/*     */     //   #110	-> 238
/*     */     //   #109	-> 244
/*     */     //   #114	-> 256
/*     */     //   #115	-> 270
/*     */     //   #122	-> 281
/*     */     //   #115	-> 288
/*     */     //   #115	-> 304
/*     */     //   #115	-> 313
/*     */     //   #115	-> 322
/*     */     //   #122	-> 328
/*     */     //   #115	-> 335
/*     */     //   #115	-> 350
/*     */     //   #115	-> 351
/*     */     //   #116	-> 366
/*     */     //   #105	-> 382
/*     */     //   #97	-> 383
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	31	1	response	Lio/ktor/client/statement/HttpResponse;
/*     */     //   133	69	1	response	Lio/ktor/client/statement/HttpResponse;
/*     */     //   256	14	1	response	Lio/ktor/client/statement/HttpResponse;
/*     */     //   158	71	3	exceptionResponseText	Ljava/lang/String;
/*     */     //   232	12	3	exceptionResponseText	Ljava/lang/String;
/*     */     //   256	21	3	exceptionResponseText	Ljava/lang/String;
/*     */     //   167	62	4	code	I
/*     */     //   232	12	4	code	I
/*     */     //   256	49	4	code	I
/*     */     //   305	17	4	code	I
/*     */     //   322	20	4	code	I
/*     */     //   342	9	4	code	I
/*     */     //   351	28	4	code	I
/*     */     //   185	44	5	headers	Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   232	12	5	headers	Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   256	49	5	headers	Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   305	17	5	headers	Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   322	20	5	headers	Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   342	9	5	headers	Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   351	28	5	headers	Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   270	7	6	url	Lio/ktor/http/Url;
/*     */     //   366	13	7	message	Ljava/lang/String;
/*     */     //   281	22	9	it	Ljava/lang/String;
/*     */     //   328	14	10	it	Ljava/lang/String;
/*     */     //   288	17	10	$i$a$-takeIf-UtilsKt$of$message$1	I
/*     */     //   335	7	11	$i$a$-let-UtilsKt$of$message$2	I
/*     */     //   0	394	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   49	334	16	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	327	15	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   93	115	149	io/ktor/utils/io/charsets/MalformedInputException
/*     */     //   133	146	149	io/ktor/utils/io/charsets/MalformedInputException
/*     */     //   202	229	232	java/lang/Exception
/*     */   }
/*     */   
/*     */   private static final boolean startsWithJsonToken(String $this$startsWithJsonToken) {
/*     */     return (StringsKt.startsWith$default($this$startsWithJsonToken, '{', false, 2, null) || StringsKt.startsWith$default($this$startsWithJsonToken, '[', false, 2, null));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\UtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */