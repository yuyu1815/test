/*    */ package ai.grazie.client.common.websocket;import org.jetbrains.annotations.NotNull;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\007\bf\030\0002\0020\001:\005\r\016\017\020\021JB\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\"\020\b\032\036\b\001\022\004\022\0020\n\022\n\022\b\022\004\022\0020\0030\013\022\006\022\004\030\0010\0010\tH¦@¢\006\002\020\fø\001\000\002\006\n\004\b!0\001¨\006\022À\006\001"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient;", "", "connect", "", "url", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "body", "Lkotlin/Function2;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Frame", "Session", "WithDebug", "WithV3", "WithV5", "client-common"})
/*    */ public interface SuspendableWebSocketClient { @Nullable
/*    */   Object connect(@NotNull String paramString, @NotNull RequestOptions paramRequestOptions, @NotNull Function2<? super Session, ? super Continuation<? super Unit>, ? extends Object> paramFunction2, @NotNull Continuation<? super Unit> paramContinuation);
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B?\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0040\006\022\034\020\007\032\030\b\001\022\n\022\b\022\004\022\0020\n0\t\022\006\022\004\030\0010\0010\b¢\006\002\020\013J\017\020\023\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\024\032\b\022\004\022\0020\0040\006HÆ\003J$\020\025\032\030\b\001\022\n\022\b\022\004\022\0020\n0\t\022\006\022\004\030\0010\0010\bHÆ\003¢\006\002\020\rJN\020\026\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0040\0062\036\b\002\020\007\032\030\b\001\022\n\022\b\022\004\022\0020\n0\t\022\006\022\004\030\0010\0010\bHÆ\001¢\006\002\020\027J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\034HÖ\001J\t\020\035\032\0020\036HÖ\001R)\020\007\032\030\b\001\022\n\022\b\022\004\022\0020\n0\t\022\006\022\004\030\0010\0010\b¢\006\n\n\002\020\016\032\004\b\f\020\rR\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\017\020\020R\027\020\005\032\b\022\004\022\0020\0040\006¢\006\b\n\000\032\004\b\021\020\022¨\006\037"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;", "", "incoming", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;", "outgoing", "Lkotlinx/coroutines/channels/SendChannel;", "close", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/jvm/functions/Function1;)V", "getClose", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "component1", "component2", "component3", "copy", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/jvm/functions/Function1;)Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;", "equals", "", "other", "hashCode", "", "toString", "", "client-common"})
/*    */   public static final class Session {
/*    */     @NotNull
/*    */     private final ReceiveChannel<SuspendableWebSocketClient.Frame> incoming;
/*    */     @NotNull
/*    */     private final SendChannel<SuspendableWebSocketClient.Frame> outgoing;
/*    */     @NotNull
/*    */     private final Function1<Continuation<? super Unit>, Object> close;
/*    */     
/* 15 */     public Session(@NotNull ReceiveChannel<SuspendableWebSocketClient.Frame> incoming, @NotNull SendChannel<SuspendableWebSocketClient.Frame> outgoing, @NotNull Function1<Continuation<? super Unit>, Object> close) { this.incoming = incoming; this.outgoing = outgoing; this.close = close; } @NotNull public final ReceiveChannel<SuspendableWebSocketClient.Frame> getIncoming() { return this.incoming; } @NotNull public final SendChannel<SuspendableWebSocketClient.Frame> getOutgoing() { return this.outgoing; } @NotNull public final Function1<Continuation<? super Unit>, Object> getClose() { return this.close; } @NotNull public final ReceiveChannel<SuspendableWebSocketClient.Frame> component1() { return this.incoming; } @NotNull public final SendChannel<SuspendableWebSocketClient.Frame> component2() { return this.outgoing; } @NotNull public final Function1<Continuation<? super Unit>, Object> component3() { return this.close; } @NotNull public final Session copy(@NotNull ReceiveChannel<? extends SuspendableWebSocketClient.Frame> incoming, @NotNull SendChannel<? super SuspendableWebSocketClient.Frame> outgoing, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> close) { Intrinsics.checkNotNullParameter(incoming, "incoming"); Intrinsics.checkNotNullParameter(outgoing, "outgoing"); Intrinsics.checkNotNullParameter(close, "close"); return new Session(incoming, outgoing, close); } @NotNull public String toString() { return "Session(incoming=" + this.incoming + ", outgoing=" + this.outgoing + ", close=" + this.close + ")"; } public int hashCode() { result = this.incoming.hashCode(); result = result * 31 + this.outgoing.hashCode(); return result * 31 + this.close.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Session)) return false;  Session session = (Session)other; return !Intrinsics.areEqual(this.incoming, session.incoming) ? false : (!Intrinsics.areEqual(this.outgoing, session.outgoing) ? false : (!!Intrinsics.areEqual(this.close, session.close))); }
/*    */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\022\n\002\b\n\b\026\030\0002\0020\001:\004\013\f\r\016B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\017"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;", "", "type", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Type;", "data", "", "(Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Type;[B)V", "getData", "()[B", "getType", "()Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Type;", "Binary", "Close", "Text", "Type", "client-common"}) public static class Frame {
/* 17 */     @NotNull private final Type type; public Frame(@NotNull Type type, @NotNull byte[] data) { this.type = type; this.data = data; } @NotNull private final byte[] data; @NotNull public final Type getType() { return this.type; } @NotNull public final byte[] getData() { return this.data; }
/*    */      @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Type;", "", "(Ljava/lang/String;I)V", "BINARY", "TEXT", "CLOSE", "client-common"})
/* 19 */     public enum Type { BINARY,
/* 20 */       TEXT,
/* 21 */       CLOSE; }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Close;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;", "()V", "client-common"})
/* 24 */     public static final class Close extends Frame { public Close() { super(SuspendableWebSocketClient.Frame.Type.CLOSE, new byte[0]); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Text;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "client-common"})
/*    */     public static final class Text extends Frame { @NotNull
/* 26 */       private final String text; public Text(@NotNull String text) { super(SuspendableWebSocketClient.Frame.Type.TEXT, StringsKt.encodeToByteArray(text)); this.text = text; } @NotNull public final String getText() { return this.text; } }
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004¨\006\005"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Binary;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;", "data", "", "([B)V", "client-common"})
/* 28 */     public static final class Binary extends Frame { public Binary(@NotNull byte[] data) { super(SuspendableWebSocketClient.Frame.Type.BINARY, data); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005JB\020\b\032\0020\t2\006\020\n\032\0020\0042\006\020\013\032\0020\f2\"\020\r\032\036\b\001\022\004\022\0020\017\022\n\022\b\022\004\022\0020\t0\020\022\006\022\004\030\0010\0210\016H@¢\006\002\020\022R\016\020\002\032\0020\001X\004¢\006\002\n\000R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007¨\006\023"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$WithV3;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient;", "client", "token", "", "(Lai/grazie/client/common/websocket/SuspendableWebSocketClient;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "connect", "", "url", "options", "Lai/grazie/client/common/model/RequestOptions;", "body", "Lkotlin/Function2;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"}) @SourceDebugExtension({"SMAP\nSuspendableWebSocketClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableWebSocketClient.kt\nai/grazie/client/common/websocket/SuspendableWebSocketClient$WithV3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/*    */   public static final class WithV3 implements SuspendableWebSocketClient { @NotNull
/*    */     private final SuspendableWebSocketClient client; @NotNull
/* 31 */     private final String token; public WithV3(@NotNull SuspendableWebSocketClient client, @NotNull String token) { this.client = client; this.token = token; } @NotNull public final String getToken() { return this.token; } @Nullable
/*    */     public Object connect(@NotNull String url, @NotNull RequestOptions options, @NotNull Function2<? super SuspendableWebSocketClient.Session, ? super Continuation<? super Unit>, ? extends Object> body, @NotNull Continuation<? super Unit> $completion) {
/* 33 */       RequestOptions requestOptions1 = options, requestOptions2 = requestOptions1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 72 */       String str = url; SuspendableWebSocketClient suspendableWebSocketClient = this.client; int $i$a$-also-SuspendableWebSocketClient$WithV3$connect$2 = 0;
/*    */       requestOptions2.getHeaders().add("Grazie-Authenticate-JWT", this.token);
/*    */       Unit unit = Unit.INSTANCE;
/*    */       if (suspendableWebSocketClient.connect(str, requestOptions1, body, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*    */         return suspendableWebSocketClient.connect(str, requestOptions1, body, $completion); 
/*    */       suspendableWebSocketClient.connect(str, requestOptions1, body, $completion);
/*    */       return Unit.INSTANCE;
/*    */     } }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\001¢\006\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\005H@¢\006\002\020\007JB\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\006\032\0020\0052\"\020\f\032\036\b\001\022\004\022\0020\016\022\n\022\b\022\004\022\0020\t0\017\022\006\022\004\030\0010\0200\rH@¢\006\002\020\021R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$WithDebug;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient;", "client", "(Lai/grazie/client/common/websocket/SuspendableWebSocketClient;)V", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "(Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect", "", "url", "", "body", "Lkotlin/Function2;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */   public static final class WithDebug implements SuspendableWebSocketClient {
/*    */     @NotNull
/*    */     private final SuspendableWebSocketClient client;
/*    */     
/*    */     public WithDebug(@NotNull SuspendableWebSocketClient client) {
/*    */       this.client = client;
/*    */     }
/*    */     
/*    */     private final Object appendHeaders(RequestOptions options, Continuation $completion) {
/*    */       (DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key);
/*    */       boolean requestDebugInfo = ((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key) != null) ? ((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key)).getProvideDebugInfo() : false;
/*    */       return DebugHeaders.INSTANCE.append(requestDebugInfo, options);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public Object connect(@NotNull String url, @NotNull RequestOptions options, @NotNull Function2 body, @NotNull Continuation $completion) {
/*    */       // Byte code:
/*    */       //   0: aload #4
/*    */       //   2: instanceof ai/grazie/client/common/websocket/SuspendableWebSocketClient$WithDebug$connect$1
/*    */       //   5: ifeq -> 41
/*    */       //   8: aload #4
/*    */       //   10: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$WithDebug$connect$1
/*    */       //   13: astore #9
/*    */       //   15: aload #9
/*    */       //   17: getfield label : I
/*    */       //   20: ldc -2147483648
/*    */       //   22: iand
/*    */       //   23: ifeq -> 41
/*    */       //   26: aload #9
/*    */       //   28: dup
/*    */       //   29: getfield label : I
/*    */       //   32: ldc -2147483648
/*    */       //   34: isub
/*    */       //   35: putfield label : I
/*    */       //   38: goto -> 53
/*    */       //   41: new ai/grazie/client/common/websocket/SuspendableWebSocketClient$WithDebug$connect$1
/*    */       //   44: dup
/*    */       //   45: aload_0
/*    */       //   46: aload #4
/*    */       //   48: invokespecial <init> : (Lai/grazie/client/common/websocket/SuspendableWebSocketClient$WithDebug;Lkotlin/coroutines/Continuation;)V
/*    */       //   51: astore #9
/*    */       //   53: aload #9
/*    */       //   55: getfield result : Ljava/lang/Object;
/*    */       //   58: astore #8
/*    */       //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   63: astore #10
/*    */       //   65: aload #9
/*    */       //   67: getfield label : I
/*    */       //   70: tableswitch default -> 252, 0 -> 96, 1 -> 152, 2 -> 240
/*    */       //   96: aload #8
/*    */       //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   101: aload_0
/*    */       //   102: getfield client : Lai/grazie/client/common/websocket/SuspendableWebSocketClient;
/*    */       //   105: aload_1
/*    */       //   106: astore #6
/*    */       //   108: astore #5
/*    */       //   110: aload_0
/*    */       //   111: aload_2
/*    */       //   112: aload #9
/*    */       //   114: aload #9
/*    */       //   116: aload_3
/*    */       //   117: putfield L$0 : Ljava/lang/Object;
/*    */       //   120: aload #9
/*    */       //   122: aload #5
/*    */       //   124: putfield L$1 : Ljava/lang/Object;
/*    */       //   127: aload #9
/*    */       //   129: aload #6
/*    */       //   131: putfield L$2 : Ljava/lang/Object;
/*    */       //   134: aload #9
/*    */       //   136: iconst_1
/*    */       //   137: putfield label : I
/*    */       //   140: invokespecial appendHeaders : (Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   143: dup
/*    */       //   144: aload #10
/*    */       //   146: if_acmpne -> 188
/*    */       //   149: aload #10
/*    */       //   151: areturn
/*    */       //   152: aload #9
/*    */       //   154: getfield L$2 : Ljava/lang/Object;
/*    */       //   157: checkcast java/lang/String
/*    */       //   160: astore #6
/*    */       //   162: aload #9
/*    */       //   164: getfield L$1 : Ljava/lang/Object;
/*    */       //   167: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient
/*    */       //   170: astore #5
/*    */       //   172: aload #9
/*    */       //   174: getfield L$0 : Ljava/lang/Object;
/*    */       //   177: checkcast kotlin/jvm/functions/Function2
/*    */       //   180: astore_3
/*    */       //   181: aload #8
/*    */       //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   186: aload #8
/*    */       //   188: astore #7
/*    */       //   190: aload #5
/*    */       //   192: aload #6
/*    */       //   194: aload #7
/*    */       //   196: checkcast ai/grazie/client/common/model/RequestOptions
/*    */       //   199: aload_3
/*    */       //   200: aload #9
/*    */       //   202: aload #9
/*    */       //   204: aconst_null
/*    */       //   205: putfield L$0 : Ljava/lang/Object;
/*    */       //   208: aload #9
/*    */       //   210: aconst_null
/*    */       //   211: putfield L$1 : Ljava/lang/Object;
/*    */       //   214: aload #9
/*    */       //   216: aconst_null
/*    */       //   217: putfield L$2 : Ljava/lang/Object;
/*    */       //   220: aload #9
/*    */       //   222: iconst_2
/*    */       //   223: putfield label : I
/*    */       //   226: invokeinterface connect : (Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   231: dup
/*    */       //   232: aload #10
/*    */       //   234: if_acmpne -> 247
/*    */       //   237: aload #10
/*    */       //   239: areturn
/*    */       //   240: aload #8
/*    */       //   242: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   245: aload #8
/*    */       //   247: pop
/*    */       //   248: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   251: areturn
/*    */       //   252: new java/lang/IllegalStateException
/*    */       //   255: dup
/*    */       //   256: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   258: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   261: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #43	-> 63
/*    */       //   #44	-> 101
/*    */       //   #43	-> 149
/*    */       //   #44	-> 188
/*    */       //   #43	-> 237
/*    */       //   #44	-> 247
/*    */       //   #43	-> 252
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   101	42	0	this	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$WithDebug;
/*    */       //   101	42	1	url	Ljava/lang/String;
/*    */       //   101	42	2	options	Lai/grazie/client/common/model/RequestOptions;
/*    */       //   101	51	3	body	Lkotlin/jvm/functions/Function2;
/*    */       //   181	50	3	body	Lkotlin/jvm/functions/Function2;
/*    */       //   0	262	4	$completion	Lkotlin/coroutines/Continuation;
/*    */       //   53	199	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */       //   60	192	8	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     @DebugMetadata(f = "SuspendableWebSocketClient.kt", l = {44, 44}, i = {0}, s = {"L$0"}, n = {"body"}, m = "connect", c = "ai.grazie.client.common.websocket.SuspendableWebSocketClient$WithDebug")
/*    */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */     static final class SuspendableWebSocketClient$WithDebug$connect$1 extends ContinuationImpl {
/*    */       Object L$0;
/*    */       Object L$1;
/*    */       Object L$2;
/*    */       int label;
/*    */       
/*    */       SuspendableWebSocketClient$WithDebug$connect$1(Continuation $completion) {
/*    */         super($completion);
/*    */       }
/*    */       
/*    */       @Nullable
/*    */       public final Object invokeSuspend(@NotNull Object $result) {
/*    */         this.result = $result;
/*    */         this.label |= Integer.MIN_VALUE;
/*    */         return SuspendableWebSocketClient.WithDebug.this.connect(null, null, null, (Continuation<? super Unit>)this);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\001¢\006\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\005H@¢\006\002\020\007JB\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\006\032\0020\0052\"\020\f\032\036\b\001\022\004\022\0020\016\022\n\022\b\022\004\022\0020\t0\017\022\006\022\004\030\0010\0200\rH@¢\006\002\020\021R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$WithV5;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient;", "client", "(Lai/grazie/client/common/websocket/SuspendableWebSocketClient;)V", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "(Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect", "", "url", "", "body", "Lkotlin/Function2;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */   public static final class WithV5 implements SuspendableWebSocketClient {
/*    */     @NotNull
/*    */     private final SuspendableWebSocketClient client;
/*    */     
/*    */     public WithV5(@NotNull SuspendableWebSocketClient client) {
/*    */       this.client = client;
/*    */     }
/*    */     
/*    */     private final Object appendHeaders(RequestOptions options, Continuation $completion) {
/*    */       AuthData authData;
/*    */       if ((AuthData)$completion.getContext().get((CoroutineContext.Key)AuthData.Key) == null) {
/*    */         (AuthData)$completion.getContext().get((CoroutineContext.Key)AuthData.Key);
/*    */         throw new IllegalStateException("For v5 requests metadata must be set");
/*    */       } 
/*    */       if ((AuthServiceToken)$completion.getContext().get((CoroutineContext.Key)AuthServiceToken.Key) == null || ((AuthServiceToken)$completion.getContext().get((CoroutineContext.Key)AuthServiceToken.Key)).getToken() == null)
/*    */         ((AuthServiceToken)$completion.getContext().get((CoroutineContext.Key)AuthServiceToken.Key)).getToken(); 
/*    */       return ((AuthServiceToken)$completion.getContext().get((CoroutineContext.Key)AuthServiceToken.Key)).getToken().append(authData.getToken(), authData.getOriginalUserToken(), authData.getOriginalServiceToken(), authData.getOriginalApplicationToken(), authData.getGrazieAgent(), authData.getOriginalUserIP(), authData.getApplicationUserId(), authData.getOriginalUserCountry(), options);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public Object connect(@NotNull String url, @NotNull RequestOptions options, @NotNull Function2 body, @NotNull Continuation $completion) {
/*    */       // Byte code:
/*    */       //   0: aload #4
/*    */       //   2: instanceof ai/grazie/client/common/websocket/SuspendableWebSocketClient$WithV5$connect$1
/*    */       //   5: ifeq -> 41
/*    */       //   8: aload #4
/*    */       //   10: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$WithV5$connect$1
/*    */       //   13: astore #9
/*    */       //   15: aload #9
/*    */       //   17: getfield label : I
/*    */       //   20: ldc -2147483648
/*    */       //   22: iand
/*    */       //   23: ifeq -> 41
/*    */       //   26: aload #9
/*    */       //   28: dup
/*    */       //   29: getfield label : I
/*    */       //   32: ldc -2147483648
/*    */       //   34: isub
/*    */       //   35: putfield label : I
/*    */       //   38: goto -> 53
/*    */       //   41: new ai/grazie/client/common/websocket/SuspendableWebSocketClient$WithV5$connect$1
/*    */       //   44: dup
/*    */       //   45: aload_0
/*    */       //   46: aload #4
/*    */       //   48: invokespecial <init> : (Lai/grazie/client/common/websocket/SuspendableWebSocketClient$WithV5;Lkotlin/coroutines/Continuation;)V
/*    */       //   51: astore #9
/*    */       //   53: aload #9
/*    */       //   55: getfield result : Ljava/lang/Object;
/*    */       //   58: astore #8
/*    */       //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   63: astore #10
/*    */       //   65: aload #9
/*    */       //   67: getfield label : I
/*    */       //   70: tableswitch default -> 252, 0 -> 96, 1 -> 152, 2 -> 240
/*    */       //   96: aload #8
/*    */       //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   101: aload_0
/*    */       //   102: getfield client : Lai/grazie/client/common/websocket/SuspendableWebSocketClient;
/*    */       //   105: aload_1
/*    */       //   106: astore #6
/*    */       //   108: astore #5
/*    */       //   110: aload_0
/*    */       //   111: aload_2
/*    */       //   112: aload #9
/*    */       //   114: aload #9
/*    */       //   116: aload_3
/*    */       //   117: putfield L$0 : Ljava/lang/Object;
/*    */       //   120: aload #9
/*    */       //   122: aload #5
/*    */       //   124: putfield L$1 : Ljava/lang/Object;
/*    */       //   127: aload #9
/*    */       //   129: aload #6
/*    */       //   131: putfield L$2 : Ljava/lang/Object;
/*    */       //   134: aload #9
/*    */       //   136: iconst_1
/*    */       //   137: putfield label : I
/*    */       //   140: invokespecial appendHeaders : (Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   143: dup
/*    */       //   144: aload #10
/*    */       //   146: if_acmpne -> 188
/*    */       //   149: aload #10
/*    */       //   151: areturn
/*    */       //   152: aload #9
/*    */       //   154: getfield L$2 : Ljava/lang/Object;
/*    */       //   157: checkcast java/lang/String
/*    */       //   160: astore #6
/*    */       //   162: aload #9
/*    */       //   164: getfield L$1 : Ljava/lang/Object;
/*    */       //   167: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient
/*    */       //   170: astore #5
/*    */       //   172: aload #9
/*    */       //   174: getfield L$0 : Ljava/lang/Object;
/*    */       //   177: checkcast kotlin/jvm/functions/Function2
/*    */       //   180: astore_3
/*    */       //   181: aload #8
/*    */       //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   186: aload #8
/*    */       //   188: astore #7
/*    */       //   190: aload #5
/*    */       //   192: aload #6
/*    */       //   194: aload #7
/*    */       //   196: checkcast ai/grazie/client/common/model/RequestOptions
/*    */       //   199: aload_3
/*    */       //   200: aload #9
/*    */       //   202: aload #9
/*    */       //   204: aconst_null
/*    */       //   205: putfield L$0 : Ljava/lang/Object;
/*    */       //   208: aload #9
/*    */       //   210: aconst_null
/*    */       //   211: putfield L$1 : Ljava/lang/Object;
/*    */       //   214: aload #9
/*    */       //   216: aconst_null
/*    */       //   217: putfield L$2 : Ljava/lang/Object;
/*    */       //   220: aload #9
/*    */       //   222: iconst_2
/*    */       //   223: putfield label : I
/*    */       //   226: invokeinterface connect : (Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   231: dup
/*    */       //   232: aload #10
/*    */       //   234: if_acmpne -> 247
/*    */       //   237: aload #10
/*    */       //   239: areturn
/*    */       //   240: aload #8
/*    */       //   242: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   245: aload #8
/*    */       //   247: pop
/*    */       //   248: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   251: areturn
/*    */       //   252: new java/lang/IllegalStateException
/*    */       //   255: dup
/*    */       //   256: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   258: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   261: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #64	-> 63
/*    */       //   #65	-> 101
/*    */       //   #64	-> 149
/*    */       //   #65	-> 188
/*    */       //   #64	-> 237
/*    */       //   #65	-> 247
/*    */       //   #64	-> 252
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   101	42	0	this	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$WithV5;
/*    */       //   101	42	1	url	Ljava/lang/String;
/*    */       //   101	42	2	options	Lai/grazie/client/common/model/RequestOptions;
/*    */       //   101	51	3	body	Lkotlin/jvm/functions/Function2;
/*    */       //   181	50	3	body	Lkotlin/jvm/functions/Function2;
/*    */       //   0	262	4	$completion	Lkotlin/coroutines/Continuation;
/*    */       //   53	199	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */       //   60	192	8	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     @DebugMetadata(f = "SuspendableWebSocketClient.kt", l = {65, 65}, i = {0}, s = {"L$0"}, n = {"body"}, m = "connect", c = "ai.grazie.client.common.websocket.SuspendableWebSocketClient$WithV5")
/*    */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */     static final class SuspendableWebSocketClient$WithV5$connect$1 extends ContinuationImpl {
/*    */       Object L$0;
/*    */       Object L$1;
/*    */       Object L$2;
/*    */       int label;
/*    */       
/*    */       SuspendableWebSocketClient$WithV5$connect$1(Continuation $completion) {
/*    */         super($completion);
/*    */       }
/*    */       
/*    */       @Nullable
/*    */       public final Object invokeSuspend(@NotNull Object $result) {
/*    */         this.result = $result;
/*    */         this.label |= Integer.MIN_VALUE;
/*    */         return SuspendableWebSocketClient.WithV5.this.connect(null, null, null, (Continuation<? super Unit>)this);
/*    */       }
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\websocket\SuspendableWebSocketClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */