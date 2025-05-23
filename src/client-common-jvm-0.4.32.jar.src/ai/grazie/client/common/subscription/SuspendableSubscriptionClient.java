/*    */ package ai.grazie.client.common.subscription;
/*    */ 
/*    */ import ai.grazie.client.common.websocket.SuspendableWebSocketClient;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\bf\030\000*\004\b\000\020\0012\0020\002:\002\f\rJr\020\003\032\0020\0042\036\b\002\020\005\032\030\b\001\022\n\022\b\022\004\022\0020\0040\007\022\006\022\004\030\0010\0020\0062\036\b\002\020\b\032\030\b\001\022\n\022\b\022\004\022\0020\0040\007\022\006\022\004\030\0010\0020\0062\"\020\t\032\036\b\001\022\004\022\0028\000\022\n\022\b\022\004\022\0020\0040\007\022\006\022\004\030\0010\0020\nH¦@¢\006\002\020\013ø\001\000\002\006\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Lai/grazie/client/common/subscription/SuspendableSubscriptionClient;", "E", "", "subscribe", "", "onConnect", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "onClose", "onEntity", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WebSocket", "WithSerializer", "client-common"})
/*    */ public interface SuspendableSubscriptionClient<E> {
/*    */   @Nullable
/*    */   Object subscribe(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> paramFunction11, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> paramFunction12, @NotNull Function2<? super E, ? super Continuation<? super Unit>, ? extends Object> paramFunction2, @NotNull Continuation<? super Unit> paramContinuation);
/*    */   
/*    */   @DebugMetadata(f = "SuspendableSubscriptionClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.SuspendableSubscriptionClient$subscribe$1")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001\"\004\b\000\020\002H@"}, d2 = {"<anonymous>", "", "E"})
/*    */   static final class SuspendableSubscriptionClient$subscribe$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> { int label;
/*    */     
/*    */     SuspendableSubscriptionClient$subscribe$1(Continuation $completion) {
/*    */       super(1, $completion);
/*    */     }
/*    */     
/* 23 */     public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super SuspendableSubscriptionClient$subscribe$1> $completion) { return (Continuation<Unit>)new SuspendableSubscriptionClient$subscribe$1($completion); } public final Object invoke(Continuation<?> p1) { return ((SuspendableSubscriptionClient$subscribe$1)create(p1)).invokeSuspend(Unit.INSTANCE); } } @DebugMetadata(f = "SuspendableSubscriptionClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.SuspendableSubscriptionClient$subscribe$2") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001\"\004\b\000\020\002H@"}, d2 = {"<anonymous>", "", "E"}) static final class SuspendableSubscriptionClient$subscribe$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> { int label; SuspendableSubscriptionClient$subscribe$2(Continuation $completion) { super(1, $completion); }
/* 24 */     public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super SuspendableSubscriptionClient$subscribe$2> $completion) { return (Continuation<Unit>)new SuspendableSubscriptionClient$subscribe$2($completion); } public final Object invoke(Continuation<?> p1) { return ((SuspendableSubscriptionClient$subscribe$2)create(p1)).invokeSuspend(Unit.INSTANCE); } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\b\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\b\022\004\022\0020\0020\001B\035\022\006\020\003\032\0020\004\022\006\020\005\032\0020\002\022\006\020\006\032\0020\007¢\006\002\020\bJn\020\017\032\0020\0202\034\020\021\032\030\b\001\022\n\022\b\022\004\022\0020\0200\023\022\006\022\004\030\0010\0240\0222\034\020\025\032\030\b\001\022\n\022\b\022\004\022\0020\0200\023\022\006\022\004\030\0010\0240\0222\"\020\026\032\036\b\001\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0200\023\022\006\022\004\030\0010\0240\027H@¢\006\002\020\030R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\013\020\fR\021\020\005\032\0020\002¢\006\b\n\000\032\004\b\r\020\016¨\006\031"}, d2 = {"Lai/grazie/client/common/subscription/SuspendableSubscriptionClient$WebSocket;", "Lai/grazie/client/common/subscription/SuspendableSubscriptionClient;", "", "client", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient;", "url", "options", "Lai/grazie/client/common/model/RequestOptions;", "(Lai/grazie/client/common/websocket/SuspendableWebSocketClient;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;)V", "getClient", "()Lai/grazie/client/common/websocket/SuspendableWebSocketClient;", "getOptions", "()Lai/grazie/client/common/model/RequestOptions;", "getUrl", "()Ljava/lang/String;", "subscribe", "", "onConnect", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "onClose", "onEntity", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"}) public static final class WebSocket implements SuspendableSubscriptionClient<String> { @NotNull private final SuspendableWebSocketClient client; @NotNull
/*    */     private final String url; @NotNull
/*    */     private final RequestOptions options;
/* 28 */     public WebSocket(@NotNull SuspendableWebSocketClient client, @NotNull String url, @NotNull RequestOptions options) { this.client = client; this.url = url; this.options = options; } @NotNull public final SuspendableWebSocketClient getClient() { return this.client; } @NotNull public final String getUrl() { return this.url; } @NotNull public final RequestOptions getOptions() { return this.options; }
/*    */     @DebugMetadata(f = "SuspendableSubscriptionClient.kt", l = {35, 36, 38, 40, 41}, i = {0, 1, 2, 3}, s = {"L$0", "L$0", "L$0", "L$0"}, n = {"session", "session", "session", "session"}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.SuspendableSubscriptionClient$WebSocket$subscribe$2") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\004H@"}, d2 = {"<anonymous>", "", "E", "session", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;"}) static final class SuspendableSubscriptionClient$WebSocket$subscribe$2 extends SuspendLambda implements Function2<SuspendableWebSocketClient.Session, Continuation<? super Unit>, Object> {
/*    */       Object L$1;
/*    */       int label;
/*    */       SuspendableSubscriptionClient$WebSocket$subscribe$2(Function1<Continuation<? super Unit>, Object> $onConnect, Function2<String, Continuation<? super Unit>, Object> $onEntity, Function1<Continuation<? super Unit>, Object> $onClose, Continuation $completion) { super(2, $completion); }
/*    */       public final Object invokeSuspend(Object $result) { // Byte code:
/*    */         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */         //   3: astore #5
/*    */         //   5: aload_0
/*    */         //   6: getfield label : I
/*    */         //   9: tableswitch default -> 362, 0 -> 48, 1 -> 89, 2 -> 147, 3 -> 238, 4 -> 305, 5 -> 348
/*    */         //   48: aload_1
/*    */         //   49: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */         //   52: aload_0
/*    */         //   53: getfield L$0 : Ljava/lang/Object;
/*    */         //   56: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$Session
/*    */         //   59: astore_2
/*    */         //   60: aload_0
/*    */         //   61: getfield $onConnect : Lkotlin/jvm/functions/Function1;
/*    */         //   64: aload_0
/*    */         //   65: aload_0
/*    */         //   66: aload_2
/*    */         //   67: putfield L$0 : Ljava/lang/Object;
/*    */         //   70: aload_0
/*    */         //   71: iconst_1
/*    */         //   72: putfield label : I
/*    */         //   75: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */         //   80: dup
/*    */         //   81: aload #5
/*    */         //   83: if_acmpne -> 102
/*    */         //   86: aload #5
/*    */         //   88: areturn
/*    */         //   89: aload_0
/*    */         //   90: getfield L$0 : Ljava/lang/Object;
/*    */         //   93: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$Session
/*    */         //   96: astore_2
/*    */         //   97: aload_1
/*    */         //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */         //   101: aload_1
/*    */         //   102: pop
/*    */         //   103: aload_2
/*    */         //   104: invokevirtual getIncoming : ()Lkotlinx/coroutines/channels/ReceiveChannel;
/*    */         //   107: invokeinterface iterator : ()Lkotlinx/coroutines/channels/ChannelIterator;
/*    */         //   112: astore_3
/*    */         //   113: aload_3
/*    */         //   114: aload_0
/*    */         //   115: checkcast kotlin/coroutines/Continuation
/*    */         //   118: aload_0
/*    */         //   119: aload_2
/*    */         //   120: putfield L$0 : Ljava/lang/Object;
/*    */         //   123: aload_0
/*    */         //   124: aload_3
/*    */         //   125: putfield L$1 : Ljava/lang/Object;
/*    */         //   128: aload_0
/*    */         //   129: iconst_2
/*    */         //   130: putfield label : I
/*    */         //   133: invokeinterface hasNext : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */         //   138: dup
/*    */         //   139: aload #5
/*    */         //   141: if_acmpne -> 168
/*    */         //   144: aload #5
/*    */         //   146: areturn
/*    */         //   147: aload_0
/*    */         //   148: getfield L$1 : Ljava/lang/Object;
/*    */         //   151: checkcast kotlinx/coroutines/channels/ChannelIterator
/*    */         //   154: astore_3
/*    */         //   155: aload_0
/*    */         //   156: getfield L$0 : Ljava/lang/Object;
/*    */         //   159: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$Session
/*    */         //   162: astore_2
/*    */         //   163: aload_1
/*    */         //   164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */         //   167: aload_1
/*    */         //   168: checkcast java/lang/Boolean
/*    */         //   171: invokevirtual booleanValue : ()Z
/*    */         //   174: ifeq -> 358
/*    */         //   177: aload_3
/*    */         //   178: invokeinterface next : ()Ljava/lang/Object;
/*    */         //   183: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame
/*    */         //   186: astore #4
/*    */         //   188: aload #4
/*    */         //   190: instanceof ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Text
/*    */         //   193: ifeq -> 263
/*    */         //   196: aload_0
/*    */         //   197: getfield $onEntity : Lkotlin/jvm/functions/Function2;
/*    */         //   200: aload #4
/*    */         //   202: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Text
/*    */         //   205: invokevirtual getText : ()Ljava/lang/String;
/*    */         //   208: aload_0
/*    */         //   209: aload_0
/*    */         //   210: aload_2
/*    */         //   211: putfield L$0 : Ljava/lang/Object;
/*    */         //   214: aload_0
/*    */         //   215: aload_3
/*    */         //   216: putfield L$1 : Ljava/lang/Object;
/*    */         //   219: aload_0
/*    */         //   220: iconst_3
/*    */         //   221: putfield label : I
/*    */         //   224: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */         //   229: dup
/*    */         //   230: aload #5
/*    */         //   232: if_acmpne -> 259
/*    */         //   235: aload #5
/*    */         //   237: areturn
/*    */         //   238: aload_0
/*    */         //   239: getfield L$1 : Ljava/lang/Object;
/*    */         //   242: checkcast kotlinx/coroutines/channels/ChannelIterator
/*    */         //   245: astore_3
/*    */         //   246: aload_0
/*    */         //   247: getfield L$0 : Ljava/lang/Object;
/*    */         //   250: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$Session
/*    */         //   253: astore_2
/*    */         //   254: aload_1
/*    */         //   255: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */         //   258: aload_1
/*    */         //   259: pop
/*    */         //   260: goto -> 113
/*    */         //   263: aload #4
/*    */         //   265: instanceof ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Close
/*    */         //   268: ifeq -> 113
/*    */         //   271: aload_0
/*    */         //   272: getfield $onClose : Lkotlin/jvm/functions/Function1;
/*    */         //   275: aload_0
/*    */         //   276: aload_0
/*    */         //   277: aload_2
/*    */         //   278: putfield L$0 : Ljava/lang/Object;
/*    */         //   281: aload_0
/*    */         //   282: aconst_null
/*    */         //   283: putfield L$1 : Ljava/lang/Object;
/*    */         //   286: aload_0
/*    */         //   287: iconst_4
/*    */         //   288: putfield label : I
/*    */         //   291: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */         //   296: dup
/*    */         //   297: aload #5
/*    */         //   299: if_acmpne -> 318
/*    */         //   302: aload #5
/*    */         //   304: areturn
/*    */         //   305: aload_0
/*    */         //   306: getfield L$0 : Ljava/lang/Object;
/*    */         //   309: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$Session
/*    */         //   312: astore_2
/*    */         //   313: aload_1
/*    */         //   314: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */         //   317: aload_1
/*    */         //   318: pop
/*    */         //   319: aload_2
/*    */         //   320: invokevirtual getClose : ()Lkotlin/jvm/functions/Function1;
/*    */         //   323: aload_0
/*    */         //   324: aload_0
/*    */         //   325: aconst_null
/*    */         //   326: putfield L$0 : Ljava/lang/Object;
/*    */         //   329: aload_0
/*    */         //   330: iconst_5
/*    */         //   331: putfield label : I
/*    */         //   334: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */         //   339: dup
/*    */         //   340: aload #5
/*    */         //   342: if_acmpne -> 353
/*    */         //   345: aload #5
/*    */         //   347: areturn
/*    */         //   348: aload_1
/*    */         //   349: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */         //   352: aload_1
/*    */         //   353: pop
/*    */         //   354: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */         //   357: areturn
/*    */         //   358: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */         //   361: areturn
/*    */         //   362: new java/lang/IllegalStateException
/*    */         //   365: dup
/*    */         //   366: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */         //   368: invokespecial <init> : (Ljava/lang/String;)V
/*    */         //   371: athrow
/*    */         // Line number table:
/*    */         //   Java source line number -> byte code offset
/*    */         //   #34	-> 3
/*    */         //   #35	-> 60
/*    */         //   #34	-> 86
/*    */         //   #36	-> 102
/*    */         //   #34	-> 144
/*    */         //   #36	-> 168
/*    */         //   #37	-> 188
/*    */         //   #38	-> 196
/*    */         //   #34	-> 235
/*    */         //   #38	-> 259
/*    */         //   #39	-> 263
/*    */         //   #40	-> 271
/*    */         //   #34	-> 302
/*    */         //   #41	-> 318
/*    */         //   #34	-> 345
/*    */         //   #42	-> 353
/*    */         //   #45	-> 358
/*    */         //   #34	-> 362
/*    */         // Local variable table:
/*    */         //   start	length	slot	name	descriptor
/*    */         //   60	29	2	session	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;
/*    */         //   97	50	2	session	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;
/*    */         //   163	75	2	session	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;
/*    */         //   254	51	2	session	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;
/*    */         //   313	26	2	session	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;
/*    */         //   358	4	2	session	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;
/*    */         //   188	41	4	it	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;
/*    */         //   263	8	4	it	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;
/*    */         //   0	372	0	this	Lai/grazie/client/common/subscription/SuspendableSubscriptionClient$WebSocket$subscribe$2;
/*    */         //   52	310	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super SuspendableSubscriptionClient$WebSocket$subscribe$2> $completion) { SuspendableSubscriptionClient$WebSocket$subscribe$2 suspendableSubscriptionClient$WebSocket$subscribe$2 = new SuspendableSubscriptionClient$WebSocket$subscribe$2(this.$onConnect, this.$onEntity, this.$onClose, $completion); suspendableSubscriptionClient$WebSocket$subscribe$2.L$0 = value;
/* 34 */         return (Continuation<Unit>)suspendableSubscriptionClient$WebSocket$subscribe$2; } public final Object invoke(SuspendableWebSocketClient.Session p1, Continuation<?> p2) { return ((SuspendableSubscriptionClient$WebSocket$subscribe$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @Nullable public Object subscribe(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onConnect, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onClose, @NotNull Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> onEntity, @NotNull Continuation $completion) { if (this.client.connect(this.url, this.options, new SuspendableSubscriptionClient$WebSocket$subscribe$2(onConnect, onEntity, onClose, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.client.connect(this.url, this.options, new SuspendableSubscriptionClient$WebSocket$subscribe$2(onConnect, onEntity, onClose, null), $completion);  this.client.connect(this.url, this.options, new SuspendableSubscriptionClient$WebSocket$subscribe$2(onConnect, onEntity, onClose, null), $completion); return Unit.INSTANCE; }
/*    */      }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B+\022\f\020\003\032\b\022\004\022\0020\0040\002\022\f\020\005\032\b\022\004\022\0028\0010\006\022\b\b\002\020\007\032\0020\b¢\006\002\020\tJn\020\020\032\0020\0212\034\020\022\032\030\b\001\022\n\022\b\022\004\022\0020\0210\024\022\006\022\004\030\0010\0250\0232\034\020\026\032\030\b\001\022\n\022\b\022\004\022\0020\0210\024\022\006\022\004\030\0010\0250\0232\"\020\027\032\036\b\001\022\004\022\0028\001\022\n\022\b\022\004\022\0020\0210\024\022\006\022\004\030\0010\0250\030H@¢\006\002\020\031R\027\020\003\032\b\022\004\022\0020\0040\002¢\006\b\n\000\032\004\b\n\020\013R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\f\020\rR\027\020\005\032\b\022\004\022\0028\0010\006¢\006\b\n\000\032\004\b\016\020\017¨\006\032"}, d2 = {"Lai/grazie/client/common/subscription/SuspendableSubscriptionClient$WithSerializer;", "E", "Lai/grazie/client/common/subscription/SuspendableSubscriptionClient;", "inner", "", "serializer", "Lkotlinx/serialization/KSerializer;", "json", "Lai/grazie/utils/json/JSON;", "(Lai/grazie/client/common/subscription/SuspendableSubscriptionClient;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V", "getInner", "()Lai/grazie/client/common/subscription/SuspendableSubscriptionClient;", "getJson", "()Lai/grazie/utils/json/JSON;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "subscribe", "", "onConnect", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "onClose", "onEntity", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */   public static final class WithSerializer<E>
/*    */     implements SuspendableSubscriptionClient<E>
/*    */   {
/*    */     @NotNull
/*    */     private final SuspendableSubscriptionClient<String> inner;
/*    */     @NotNull
/*    */     private final KSerializer<E> serializer;
/*    */     @NotNull
/*    */     private final JSON json;
/*    */     
/*    */     public WithSerializer(@NotNull SuspendableSubscriptionClient<String> inner, @NotNull KSerializer<E> serializer, @NotNull JSON json) {
/* 50 */       this.inner = inner; this.serializer = serializer; this.json = json; } @NotNull public final SuspendableSubscriptionClient<String> getInner() { return this.inner; } @NotNull public final KSerializer<E> getSerializer() { return this.serializer; } @NotNull public final JSON getJson() { return this.json; }
/*    */     
/*    */     @Nullable
/* 53 */     public Object subscribe(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onConnect, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onClose, @NotNull Function2<? super E, ? super Continuation<? super Unit>, ? extends Object> onEntity, @NotNull Continuation<? super Unit> $completion) { if (this.inner.subscribe(onConnect, onClose, new SuspendableSubscriptionClient$WithSerializer$subscribe$2(this, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.inner.subscribe(onConnect, onClose, new SuspendableSubscriptionClient$WithSerializer$subscribe$2(this, null), $completion);  this.inner.subscribe(onConnect, onClose, new SuspendableSubscriptionClient$WithSerializer$subscribe$2(this, null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "SuspendableSubscriptionClient.kt", l = {54}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.SuspendableSubscriptionClient$WithSerializer$subscribe$2") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\b\002\n\002\020\016\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0022\006\020\003\032\0020\004H@"}, d2 = {"<anonymous>", "", "E", "it", ""}) static final class SuspendableSubscriptionClient$WithSerializer$subscribe$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> { int label; SuspendableSubscriptionClient$WithSerializer$subscribe$2(SuspendableSubscriptionClient.WithSerializer<E> $receiver, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { String it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (String)this.L$0;
/* 54 */             this.label = 1; if (this.$onEntity.invoke(SuspendableSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)SuspendableSubscriptionClient.WithSerializer.this.getSerializer(), it), this) == object) return object;  this.$onEntity.invoke(SuspendableSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)SuspendableSubscriptionClient.WithSerializer.this.getSerializer(), it), this);
/* 55 */             return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */         
/*    */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */       
/*    */       public final Continuation<Unit> create(Object value, Continuation<? super SuspendableSubscriptionClient$WithSerializer$subscribe$2> $completion) {
/*    */         SuspendableSubscriptionClient$WithSerializer$subscribe$2 suspendableSubscriptionClient$WithSerializer$subscribe$2 = new SuspendableSubscriptionClient$WithSerializer$subscribe$2(SuspendableSubscriptionClient.WithSerializer.this, $completion);
/*    */         suspendableSubscriptionClient$WithSerializer$subscribe$2.L$0 = value;
/*    */         return (Continuation<Unit>)suspendableSubscriptionClient$WithSerializer$subscribe$2;
/*    */       }
/*    */       
/*    */       public final Object invoke(String p1, Continuation<?> p2) {
/*    */         return ((SuspendableSubscriptionClient$WithSerializer$subscribe$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */       } }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\subscription\SuspendableSubscriptionClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */