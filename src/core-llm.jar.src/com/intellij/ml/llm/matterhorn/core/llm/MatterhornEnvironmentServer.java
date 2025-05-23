/*     */ package com.intellij.ml.llm.matterhorn.core.llm;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.openai.OpenAiChatRequestBody;
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
/*     */ import io.netty.handler.codec.http.HttpHeaderNames;
/*     */ import io.netty.handler.codec.http.HttpHeaderValues;
/*     */ import io.netty.handler.codec.http.HttpResponseStatus;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonBuilder;
/*     */ import kotlinx.serialization.json.JsonKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.reactivestreams.Publisher;
/*     */ import reactor.core.publisher.Mono;
/*     */ import reactor.netty.DisposableServer;
/*     */ import reactor.netty.http.server.HttpServerRequest;
/*     */ import reactor.netty.http.server.HttpServerResponse;
/*     */ import reactor.netty.http.server.HttpServerRoutes;
/*     */ 
/*     */ @Service
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\006\020\r\032\0020\016J\020\020\017\032\0020\0202\006\020\021\032\0020\022H\002J\036\020\023\032\0020\0242\006\020\025\032\0020\0262\006\020\027\032\0020\fH@¢\006\002\020\030J\b\020\031\032\0020\020H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\020\020\006\032\004\030\0010\007X\004¢\006\002\n\000R\026\020\b\032\n\022\004\022\0020\n\030\0010\tX\016¢\006\002\n\000R\020\020\013\032\004\030\0010\fX\016¢\006\002\n\000¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;", "Lcom/intellij/openapi/Disposable;", "<init>", "()V", "lock", "", "server", "Lreactor/netty/DisposableServer;", "requestDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerPostActionRequest;", "currentState", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;", "isAvailable", "", "setupRoutes", "", "routes", "Lreactor/netty/http/server/HttpServerRoutes;", "waitForRequest", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "model", "Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "state", "(Lcom/intellij/ml/llm/matterhorn/llm/LLM;Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornEnvironmentServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornEnvironmentServer.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,157:1\n1611#2,9:158\n1863#2:167\n1864#2:169\n1620#2:170\n1#3:168\n1#3:171\n205#4:172\n222#4:173\n*S KotlinDebug\n*F\n+ 1 MatterhornEnvironmentServer.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer\n*L\n138#1:158,9\n138#1:167\n138#1:169\n138#1:170\n138#1:168\n73#1:172\n86#1:173\n*E\n"})
/*     */ public final class MatterhornEnvironmentServer implements Disposable {
/*     */   @NotNull
/*     */   private final Object lock;
/*     */   @Nullable
/*     */   private final DisposableServer server;
/*     */   @Nullable
/*     */   private CompletableDeferred<MatterhornEnvironmentServerPostActionRequest> requestDeferred;
/*     */   @Nullable
/*     */   private OpenAiChatRequestBody currentState;
/*     */   
/*     */   public MatterhornEnvironmentServer() {
/*  45 */     this.lock = new Object();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  52 */     EnvExtensionsKt.assertMatterhornEnvironmentServerMode(BuildConfigKt.getConfig());
/*     */     
/*  54 */     this.server = (DisposableServer)BuildersKt.runBlocking$default(null, new Function2<CoroutineScope, Continuation<? super DisposableServer>, Object>(null) {
/*     */           int label; public final Object invokeSuspend(Object $result) {
/*     */             // Byte code:
/*     */             //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */             //   3: astore_3
/*     */             //   4: aload_0
/*     */             //   5: getfield label : I
/*     */             //   8: tableswitch default -> 103, 0 -> 32, 1 -> 55
/*     */             //   32: aload_1
/*     */             //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */             //   36: aload_0
/*     */             //   37: checkcast kotlin/coroutines/Continuation
/*     */             //   40: aload_0
/*     */             //   41: iconst_1
/*     */             //   42: putfield label : I
/*     */             //   45: invokestatic getMatterhornEnvironmentServerPort : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */             //   48: dup
/*     */             //   49: aload_3
/*     */             //   50: if_acmpne -> 60
/*     */             //   53: aload_3
/*     */             //   54: areturn
/*     */             //   55: aload_1
/*     */             //   56: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */             //   59: aload_1
/*     */             //   60: checkcast java/lang/Integer
/*     */             //   63: astore_2
/*     */             //   64: aload_2
/*     */             //   65: ifnull -> 101
/*     */             //   68: invokestatic create : ()Lreactor/netty/http/server/HttpServer;
/*     */             //   71: aload_2
/*     */             //   72: invokevirtual intValue : ()I
/*     */             //   75: invokevirtual port : (I)Lreactor/netty/http/server/HttpServer;
/*     */             //   78: aload_0
/*     */             //   79: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;
/*     */             //   82: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;)Lkotlin/jvm/functions/Function1;
/*     */             //   87: <illegal opcode> accept : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
/*     */             //   92: invokevirtual route : (Ljava/util/function/Consumer;)Lreactor/netty/http/server/HttpServer;
/*     */             //   95: invokevirtual bindNow : ()Lreactor/netty/DisposableServer;
/*     */             //   98: goto -> 102
/*     */             //   101: aconst_null
/*     */             //   102: areturn
/*     */             //   103: new java/lang/IllegalStateException
/*     */             //   106: dup
/*     */             //   107: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */             //   109: invokespecial <init> : (Ljava/lang/String;)V
/*     */             //   112: athrow
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #54	-> 3
/*     */             //   #55	-> 40
/*     */             //   #54	-> 53
/*     */             //   #56	-> 64
/*     */             //   #57	-> 68
/*     */             //   #58	-> 101
/*     */             //   #54	-> 103
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   64	23	2	port	Ljava/lang/Integer;
/*     */             //   0	113	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer$1;
/*     */             //   36	67	1	$result	Ljava/lang/Object;
/*  57 */           } private static final Unit invokeSuspend$lambda$0(MatterhornEnvironmentServer this$0, HttpServerRoutes it) { Intrinsics.checkNotNull(it); MatterhornEnvironmentServer.this.setupRoutes(it); return Unit.INSTANCE; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(MatterhornEnvironmentServer.this, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } private static final void invokeSuspend$lambda$1(Function1 $tmp0, Object p0) { $tmp0.invoke(p0); }
/*     */         
/*     */         }1, null);
/*     */   }
/*     */   
/*     */   public final boolean isAvailable() {
/*  63 */     return (this.server != null);
/*     */   }
/*     */   
/*     */   private final void setupRoutes(HttpServerRoutes routes) {
/*  67 */     routes.get("/state", this::setupRoutes$lambda$1::setupRoutes$lambda$2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     routes.post("/action", this::setupRoutes$lambda$7::setupRoutes$lambda$8);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     routes.post("/terminate", this::setupRoutes$lambda$10::setupRoutes$lambda$11);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Publisher setupRoutes$lambda$2(Function2 $tmp0, Object p0, Object p1) {
/*     */     return (Publisher)$tmp0.invoke(p0, p1);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Publisher setupRoutes$lambda$1(MatterhornEnvironmentServer this$0, HttpServerRequest request, HttpServerResponse response)
/*     */   {
/*     */     synchronized (this$0.lock) {
/* 171 */       int $i$a$-synchronized-MatterhornEnvironmentServer$setupRoutes$1$state$1 = 0; OpenAiChatRequestBody openAiChatRequestBody = this$0.currentState;
/* 172 */     }  OpenAiChatRequestBody state = openAiChatRequestBody; Json this_$iv = (Json)Json.Default; int $i$f$encodeToString = 0; this_$iv.getSerializersModule(); return (state != null) ? (Publisher)response.status(HttpResponseStatus.OK).header((CharSequence)HttpHeaderNames.CONTENT_TYPE, (CharSequence)HttpHeaderValues.APPLICATION_JSON).sendString((Publisher)Mono.just(this_$iv.encodeToString((SerializationStrategy)OpenAiChatRequestBody.Companion.serializer(), state))) : (Publisher)response.status(HttpResponseStatus.PROCESSING).send(); } private static final Mono setupRoutes$lambda$7$lambda$5(MatterhornEnvironmentServer this$0, HttpServerResponse $response, String body) { Mono mono; try {
/* 173 */       Json json = JsonKt.Json$default(null, MatterhornEnvironmentServer::setupRoutes$lambda$7$lambda$5$lambda$3, 1, null); Json json1 = json; Intrinsics.checkNotNull(body); String string$iv = body; int $i$f$decodeFromString = 0; json1.getSerializersModule(); MatterhornEnvironmentServerPostActionRequest deserializedResponse = (MatterhornEnvironmentServerPostActionRequest)json1.decodeFromString((DeserializationStrategy)MatterhornEnvironmentServerPostActionRequest.Companion.serializer(), string$iv);
/*     */       synchronized (this$0.lock) {
/*     */         int $i$a$-synchronized-MatterhornEnvironmentServer$setupRoutes$2$1$deferred$1 = 0;
/*     */         this$0.currentState = null;
/*     */         CompletableDeferred<MatterhornEnvironmentServerPostActionRequest> completableDeferred = this$0.requestDeferred;
/*     */       } 
/*     */       CompletableDeferred<MatterhornEnvironmentServerPostActionRequest> deferred = completableDeferred;
/*     */       deferred.complete(deserializedResponse);
/*     */       mono = (deferred != null) ? $response.status(HttpResponseStatus.OK).send().then() : $response.status(HttpResponseStatus.CONFLICT).send().then();
/*     */     } catch (Exception e) {
/*     */       mono = $response.status(HttpResponseStatus.BAD_REQUEST).send().then();
/*     */     } 
/*     */     return mono; }
/*     */ 
/*     */   
/*     */   private static final Publisher setupRoutes$lambda$8(Function2 $tmp0, Object p0, Object p1) {
/*     */     return (Publisher)$tmp0.invoke(p0, p1);
/*     */   }
/*     */   
/*     */   private static final Publisher setupRoutes$lambda$7(MatterhornEnvironmentServer this$0, HttpServerRequest request, HttpServerResponse response) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface receive : ()Lreactor/netty/ByteBufFlux;
/*     */     //   6: invokevirtual aggregate : ()Lreactor/netty/ByteBufMono;
/*     */     //   9: invokevirtual asString : ()Lreactor/core/publisher/Mono;
/*     */     //   12: aload_0
/*     */     //   13: aload_2
/*     */     //   14: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;Lreactor/netty/http/server/HttpServerResponse;)Lkotlin/jvm/functions/Function1;
/*     */     //   19: <illegal opcode> apply : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Function;
/*     */     //   24: invokevirtual flatMap : (Ljava/util/function/Function;)Lreactor/core/publisher/Mono;
/*     */     //   27: checkcast org/reactivestreams/Publisher
/*     */     //   30: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #80	-> 0
/*     */     //   #81	-> 6
/*     */     //   #82	-> 9
/*     */     //   #83	-> 12
/*     */     //   #100	-> 30
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	31	0	this$0	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;
/*     */     //   0	31	1	request	Lreactor/netty/http/server/HttpServerRequest;
/*     */     //   0	31	2	response	Lreactor/netty/http/server/HttpServerResponse;
/*     */   }
/*     */   
/*     */   private static final Mono setupRoutes$lambda$7$lambda$6(Function1 $tmp0, Object p0) {
/*     */     return (Mono)$tmp0.invoke(p0);
/*     */   }
/*     */   
/*     */   private static final Unit setupRoutes$lambda$7$lambda$5$lambda$3(JsonBuilder $this$Json) {
/*     */     Intrinsics.checkNotNullParameter($this$Json, "$this$Json");
/*     */     $this$Json.setIgnoreUnknownKeys(true);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Publisher setupRoutes$lambda$11(Function2 $tmp0, Object p0, Object p1) {
/*     */     return (Publisher)$tmp0.invoke(p0, p1);
/*     */   }
/*     */   
/*     */   private static final Publisher setupRoutes$lambda$10(MatterhornEnvironmentServer this$0, HttpServerRequest paramHttpServerRequest, HttpServerResponse response) {
/*     */     return (Publisher)response.status(HttpResponseStatus.OK).send().then().doOnTerminate(this$0::setupRoutes$lambda$10$lambda$9);
/*     */   }
/*     */   
/*     */   private static final void setupRoutes$lambda$10$lambda$9(MatterhornEnvironmentServer this$0) {
/*     */     this$0.dispose();
/*     */     System.exit(2);
/*     */     throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object waitForRequest(@NotNull LLM model, @NotNull OpenAiChatRequestBody state, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer$waitForRequest$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer$waitForRequest$1
/*     */     //   11: astore #23
/*     */     //   13: aload #23
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #23
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer$waitForRequest$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #23
/*     */     //   50: aload #23
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #22
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #24
/*     */     //   62: aload #23
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 732, 0 -> 88, 1 -> 261
/*     */     //   88: aload #22
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield lock : Ljava/lang/Object;
/*     */     //   97: astore #5
/*     */     //   99: aload #5
/*     */     //   101: monitorenter
/*     */     //   102: nop
/*     */     //   103: iconst_0
/*     */     //   104: istore #6
/*     */     //   106: aload_0
/*     */     //   107: getfield currentState : Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;
/*     */     //   110: ifnonnull -> 117
/*     */     //   113: iconst_1
/*     */     //   114: goto -> 118
/*     */     //   117: iconst_0
/*     */     //   118: istore #7
/*     */     //   120: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   123: ifeq -> 145
/*     */     //   126: iload #7
/*     */     //   128: ifne -> 145
/*     */     //   131: ldc 'Assertion failed'
/*     */     //   133: astore #8
/*     */     //   135: new java/lang/AssertionError
/*     */     //   138: dup
/*     */     //   139: aload #8
/*     */     //   141: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   144: athrow
/*     */     //   145: aload_0
/*     */     //   146: getfield requestDeferred : Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   149: ifnonnull -> 156
/*     */     //   152: iconst_1
/*     */     //   153: goto -> 157
/*     */     //   156: iconst_0
/*     */     //   157: istore #7
/*     */     //   159: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   162: ifeq -> 184
/*     */     //   165: iload #7
/*     */     //   167: ifne -> 184
/*     */     //   170: ldc 'Assertion failed'
/*     */     //   172: astore #8
/*     */     //   174: new java/lang/AssertionError
/*     */     //   177: dup
/*     */     //   178: aload #8
/*     */     //   180: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   183: athrow
/*     */     //   184: aload_0
/*     */     //   185: aload_2
/*     */     //   186: putfield currentState : Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;
/*     */     //   189: aload_0
/*     */     //   190: aconst_null
/*     */     //   191: iconst_1
/*     */     //   192: aconst_null
/*     */     //   193: invokestatic CompletableDeferred$default : (Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   196: putfield requestDeferred : Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   199: nop
/*     */     //   200: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   203: astore #6
/*     */     //   205: aload #5
/*     */     //   207: monitorexit
/*     */     //   208: goto -> 219
/*     */     //   211: astore #6
/*     */     //   213: aload #5
/*     */     //   215: monitorexit
/*     */     //   216: aload #6
/*     */     //   218: athrow
/*     */     //   219: aload_0
/*     */     //   220: getfield requestDeferred : Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   223: dup
/*     */     //   224: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   227: aload #23
/*     */     //   229: aload #23
/*     */     //   231: aload_0
/*     */     //   232: putfield L$0 : Ljava/lang/Object;
/*     */     //   235: aload #23
/*     */     //   237: aload_1
/*     */     //   238: putfield L$1 : Ljava/lang/Object;
/*     */     //   241: aload #23
/*     */     //   243: iconst_1
/*     */     //   244: putfield label : I
/*     */     //   247: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   252: dup
/*     */     //   253: aload #24
/*     */     //   255: if_acmpne -> 286
/*     */     //   258: aload #24
/*     */     //   260: areturn
/*     */     //   261: aload #23
/*     */     //   263: getfield L$1 : Ljava/lang/Object;
/*     */     //   266: checkcast com/intellij/ml/llm/matterhorn/llm/LLM
/*     */     //   269: astore_1
/*     */     //   270: aload #23
/*     */     //   272: getfield L$0 : Ljava/lang/Object;
/*     */     //   275: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer
/*     */     //   278: astore_0
/*     */     //   279: aload #22
/*     */     //   281: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   284: aload #22
/*     */     //   286: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerPostActionRequest
/*     */     //   289: astore #4
/*     */     //   291: aload_0
/*     */     //   292: getfield lock : Ljava/lang/Object;
/*     */     //   295: astore #6
/*     */     //   297: aload #6
/*     */     //   299: monitorenter
/*     */     //   300: nop
/*     */     //   301: iconst_0
/*     */     //   302: istore #7
/*     */     //   304: aload_0
/*     */     //   305: getfield currentState : Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;
/*     */     //   308: ifnonnull -> 315
/*     */     //   311: iconst_1
/*     */     //   312: goto -> 316
/*     */     //   315: iconst_0
/*     */     //   316: istore #8
/*     */     //   318: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   321: ifeq -> 343
/*     */     //   324: iload #8
/*     */     //   326: ifne -> 343
/*     */     //   329: ldc 'Assertion failed'
/*     */     //   331: astore #9
/*     */     //   333: new java/lang/AssertionError
/*     */     //   336: dup
/*     */     //   337: aload #9
/*     */     //   339: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   342: athrow
/*     */     //   343: aload_0
/*     */     //   344: getfield requestDeferred : Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   347: ifnull -> 354
/*     */     //   350: iconst_1
/*     */     //   351: goto -> 355
/*     */     //   354: iconst_0
/*     */     //   355: istore #8
/*     */     //   357: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   360: ifeq -> 382
/*     */     //   363: iload #8
/*     */     //   365: ifne -> 382
/*     */     //   368: ldc 'Assertion failed'
/*     */     //   370: astore #9
/*     */     //   372: new java/lang/AssertionError
/*     */     //   375: dup
/*     */     //   376: aload #9
/*     */     //   378: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   381: athrow
/*     */     //   382: aload_0
/*     */     //   383: aconst_null
/*     */     //   384: putfield requestDeferred : Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   387: nop
/*     */     //   388: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   391: astore #7
/*     */     //   393: aload #6
/*     */     //   395: monitorexit
/*     */     //   396: goto -> 407
/*     */     //   399: astore #7
/*     */     //   401: aload #6
/*     */     //   403: monitorexit
/*     */     //   404: aload #7
/*     */     //   406: athrow
/*     */     //   407: aload #4
/*     */     //   409: invokevirtual getError : ()Ljava/lang/String;
/*     */     //   412: ifnull -> 433
/*     */     //   415: new java/lang/Exception
/*     */     //   418: dup
/*     */     //   419: aload #4
/*     */     //   421: invokevirtual getError : ()Ljava/lang/String;
/*     */     //   424: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   429: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   432: athrow
/*     */     //   433: aload #4
/*     */     //   435: invokevirtual getChatCompletion : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;
/*     */     //   438: dup
/*     */     //   439: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   442: astore #5
/*     */     //   444: aload #5
/*     */     //   446: invokevirtual getChoices : ()Ljava/util/List;
/*     */     //   449: checkcast java/lang/Iterable
/*     */     //   452: astore #7
/*     */     //   454: iconst_0
/*     */     //   455: istore #8
/*     */     //   457: aload #7
/*     */     //   459: astore #9
/*     */     //   461: new java/util/ArrayList
/*     */     //   464: dup
/*     */     //   465: invokespecial <init> : ()V
/*     */     //   468: checkcast java/util/Collection
/*     */     //   471: astore #10
/*     */     //   473: iconst_0
/*     */     //   474: istore #11
/*     */     //   476: aload #9
/*     */     //   478: astore #12
/*     */     //   480: iconst_0
/*     */     //   481: istore #13
/*     */     //   483: aload #12
/*     */     //   485: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   490: astore #14
/*     */     //   492: aload #14
/*     */     //   494: invokeinterface hasNext : ()Z
/*     */     //   499: ifeq -> 606
/*     */     //   502: aload #14
/*     */     //   504: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   509: astore #15
/*     */     //   511: aload #15
/*     */     //   513: astore #16
/*     */     //   515: iconst_0
/*     */     //   516: istore #17
/*     */     //   518: aload #16
/*     */     //   520: checkcast com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoice
/*     */     //   523: astore #18
/*     */     //   525: iconst_0
/*     */     //   526: istore #19
/*     */     //   528: aload #18
/*     */     //   530: instanceof com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoiceChat
/*     */     //   533: ifeq -> 579
/*     */     //   536: new com/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice
/*     */     //   539: dup
/*     */     //   540: aload #18
/*     */     //   542: checkcast com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoiceChat
/*     */     //   545: invokevirtual getMessage : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChatMessage;
/*     */     //   548: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   551: dup
/*     */     //   552: ifnonnull -> 559
/*     */     //   555: pop
/*     */     //   556: ldc_w ''
/*     */     //   559: aload #18
/*     */     //   561: checkcast com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoiceChat
/*     */     //   564: invokevirtual getMessage : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChatMessage;
/*     */     //   567: invokevirtual getLogits : ()Ljava/util/List;
/*     */     //   570: aconst_null
/*     */     //   571: iconst_4
/*     */     //   572: aconst_null
/*     */     //   573: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   576: goto -> 580
/*     */     //   579: aconst_null
/*     */     //   580: dup
/*     */     //   581: ifnull -> 602
/*     */     //   584: astore #20
/*     */     //   586: iconst_0
/*     */     //   587: istore #21
/*     */     //   589: aload #10
/*     */     //   591: aload #20
/*     */     //   593: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   598: pop
/*     */     //   599: goto -> 603
/*     */     //   602: pop
/*     */     //   603: goto -> 492
/*     */     //   606: nop
/*     */     //   607: aload #10
/*     */     //   609: checkcast java/util/List
/*     */     //   612: nop
/*     */     //   613: astore #6
/*     */     //   615: aload #5
/*     */     //   617: invokevirtual getUsage : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;
/*     */     //   620: dup
/*     */     //   621: ifnull -> 637
/*     */     //   624: invokevirtual getPromptTokensDetails : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/PromptTokensDetails;
/*     */     //   627: dup
/*     */     //   628: ifnull -> 637
/*     */     //   631: invokevirtual getCachedTokens : ()J
/*     */     //   634: goto -> 667
/*     */     //   637: pop
/*     */     //   638: aload #5
/*     */     //   640: invokevirtual getUsage : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;
/*     */     //   643: dup
/*     */     //   644: ifnull -> 653
/*     */     //   647: invokevirtual getPromptCacheHitTokens : ()Ljava/lang/Long;
/*     */     //   650: goto -> 655
/*     */     //   653: pop
/*     */     //   654: aconst_null
/*     */     //   655: dup
/*     */     //   656: ifnull -> 665
/*     */     //   659: invokevirtual longValue : ()J
/*     */     //   662: goto -> 667
/*     */     //   665: pop
/*     */     //   666: lconst_0
/*     */     //   667: lstore #7
/*     */     //   669: new com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   672: dup
/*     */     //   673: aload_1
/*     */     //   674: aload #6
/*     */     //   676: checkcast java/lang/Iterable
/*     */     //   679: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   682: aload #5
/*     */     //   684: invokevirtual getUsage : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;
/*     */     //   687: dup
/*     */     //   688: ifnull -> 700
/*     */     //   691: invokevirtual getPromptTokens : ()J
/*     */     //   694: lload #7
/*     */     //   696: lsub
/*     */     //   697: goto -> 702
/*     */     //   700: pop
/*     */     //   701: lconst_0
/*     */     //   702: aload #5
/*     */     //   704: invokevirtual getUsage : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;
/*     */     //   707: dup
/*     */     //   708: ifnull -> 717
/*     */     //   711: invokevirtual getCompletionTokens : ()J
/*     */     //   714: goto -> 719
/*     */     //   717: pop
/*     */     //   718: lconst_0
/*     */     //   719: lload #7
/*     */     //   721: lconst_0
/*     */     //   722: lconst_0
/*     */     //   723: iconst_0
/*     */     //   724: sipush #224
/*     */     //   727: aconst_null
/*     */     //   728: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;Ljava/util/List;JJJJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   731: areturn
/*     */     //   732: new java/lang/IllegalStateException
/*     */     //   735: dup
/*     */     //   736: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   739: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   742: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #114	-> 60
/*     */     //   #115	-> 93
/*     */     //   #116	-> 106
/*     */     //   #117	-> 145
/*     */     //   #119	-> 184
/*     */     //   #120	-> 189
/*     */     //   #121	-> 199
/*     */     //   #115	-> 203
/*     */     //   #123	-> 219
/*     */     //   #114	-> 258
/*     */     //   #125	-> 291
/*     */     //   #126	-> 304
/*     */     //   #127	-> 343
/*     */     //   #129	-> 382
/*     */     //   #130	-> 387
/*     */     //   #125	-> 391
/*     */     //   #132	-> 407
/*     */     //   #133	-> 415
/*     */     //   #136	-> 433
/*     */     //   #138	-> 444
/*     */     //   #158	-> 457
/*     */     //   #166	-> 476
/*     */     //   #167	-> 483
/*     */     //   #166	-> 518
/*     */     //   #139	-> 528
/*     */     //   #140	-> 536
/*     */     //   #141	-> 579
/*     */     //   #166	-> 580
/*     */     //   #168	-> 586
/*     */     //   #166	-> 589
/*     */     //   #166	-> 599
/*     */     //   #166	-> 602
/*     */     //   #167	-> 603
/*     */     //   #169	-> 606
/*     */     //   #170	-> 607
/*     */     //   #158	-> 612
/*     */     //   #138	-> 613
/*     */     //   #144	-> 615
/*     */     //   #143	-> 667
/*     */     //   #145	-> 669
/*     */     //   #146	-> 673
/*     */     //   #147	-> 674
/*     */     //   #148	-> 682
/*     */     //   #149	-> 702
/*     */     //   #150	-> 719
/*     */     //   #145	-> 721
/*     */     //   #114	-> 732
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	52	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;
/*     */     //   145	39	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;
/*     */     //   184	16	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;
/*     */     //   200	11	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;
/*     */     //   219	42	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;
/*     */     //   279	64	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;
/*     */     //   343	39	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;
/*     */     //   382	5	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServer;
/*     */     //   93	52	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   145	39	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   184	16	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   200	11	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   219	42	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   270	73	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   343	39	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   382	6	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   388	11	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   407	8	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   433	147	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   580	33	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   613	61	1	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   93	52	2	state	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;
/*     */     //   145	39	2	state	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;
/*     */     //   184	5	2	state	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;
/*     */     //   291	52	4	result	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerPostActionRequest;
/*     */     //   343	39	4	result	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerPostActionRequest;
/*     */     //   382	6	4	result	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerPostActionRequest;
/*     */     //   388	11	4	result	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerPostActionRequest;
/*     */     //   407	26	4	result	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerPostActionRequest;
/*     */     //   433	11	4	result	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerPostActionRequest;
/*     */     //   444	136	5	chatCompletion	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;
/*     */     //   580	33	5	chatCompletion	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;
/*     */     //   613	94	5	chatCompletion	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;
/*     */     //   615	67	6	choices	Ljava/util/List;
/*     */     //   454	19	7	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*     */     //   669	63	7	cacheReadTokens	J
/*     */     //   473	7	9	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   473	107	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   580	29	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   480	12	12	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   511	4	15	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   515	10	16	element$iv$iv	Ljava/lang/Object;
/*     */     //   525	54	18	it	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoice;
/*     */     //   586	13	20	it$iv$iv	Ljava/lang/Object;
/*     */     //   106	94	6	$i$a$-synchronized-MatterhornEnvironmentServer$waitForRequest$2	I
/*     */     //   304	84	7	$i$a$-synchronized-MatterhornEnvironmentServer$waitForRequest$3	I
/*     */     //   528	52	19	$i$a$-mapNotNull-MatterhornEnvironmentServer$waitForRequest$choices$1	I
/*     */     //   589	10	21	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   518	85	17	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   483	124	13	$i$f$forEach	I
/*     */     //   476	133	11	$i$f$mapNotNullTo	I
/*     */     //   457	156	8	$i$f$mapNotNull	I
/*     */     //   0	743	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	682	23	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	675	22	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   102	205	211	finally
/*     */     //   211	213	211	finally
/*     */     //   300	393	399	finally
/*     */     //   399	401	399	finally
/*     */   }
/*     */   
/*     */   public void dispose() {
/*     */     if (this.server != null) {
/*     */       this.server.dispose();
/*     */     } else {
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornEnvironmentServer.kt", l = {123}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "model"}, m = "waitForRequest", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornEnvironmentServer")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class MatterhornEnvironmentServer$waitForRequest$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     MatterhornEnvironmentServer$waitForRequest$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return MatterhornEnvironmentServer.this.waitForRequest(null, null, (Continuation<? super AIAnswer>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornEnvironmentServer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */