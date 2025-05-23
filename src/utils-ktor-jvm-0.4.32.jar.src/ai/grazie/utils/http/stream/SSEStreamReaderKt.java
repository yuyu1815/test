/*    */ package ai.grazie.utils.http.stream;
/*    */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000<\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\032\024\020\002\032\004\030\0010\003*\0020\004H@¢\006\002\020\005\032x\020\006\032\0020\007*\0020\b2\006\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\f2$\b\002\020\016\032\036\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\0020\f0\020\022\006\022\004\030\0010\0210\0172\"\020\022\032\036\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\0020\0070\020\022\006\022\004\030\0010\0210\017H@¢\006\002\020\023\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\024"}, d2 = {"logger", "Lai/grazie/utils/mpp/MPPLogger;", "readEvent", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readSse", "", "Lio/ktor/client/HttpClient;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "skipCommentEvent", "", "skipReconnect", "isEnd", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-ktor"})
/*    */ public final class SSEStreamReaderKt {
/*    */   @NotNull
/* 10 */   private static final MPPLogger logger = LoggerFactory.INSTANCE.create("ai.grazie.utils.http.sse.SSE"); @DebugMetadata(f = "SSEStreamReader.kt", l = {88}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this$readEvent", "builder"}, m = "readEvent", c = "ai.grazie.utils.http.stream.SSEStreamReaderKt")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SSEStreamReaderKt$readEvent$1 extends ContinuationImpl {
/*    */     Object L$0; Object L$1; int label; SSEStreamReaderKt$readEvent$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SSEStreamReaderKt.readEvent(null, (Continuation)this);
/*    */     } }
/*    */   @DebugMetadata(f = "SSEStreamReader.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.stream.SSEStreamReaderKt$readSse$2")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/model/cloud/sse/ServerSentEvent;"})
/*    */   static final class SSEStreamReaderKt$readSse$2 extends SuspendLambda implements Function2<ServerSentEvent, Continuation<? super Boolean>, Object> {
/*    */     int label;
/*    */     SSEStreamReaderKt$readSse$2(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/* 29 */     public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(false); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super SSEStreamReaderKt$readSse$2> $completion) { return (Continuation<Unit>)new SSEStreamReaderKt$readSse$2($completion); } public final Object invoke(ServerSentEvent p1, Continuation<?> p2) { return ((SSEStreamReaderKt$readSse$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); }
/*    */   } @Nullable
/* 32 */   public static final Object readSse(@NotNull HttpClient $this$readSse, @NotNull HttpRequestBuilder request, boolean skipCommentEvent, boolean skipReconnect, @NotNull Function2<? super ServerSentEvent, ? super Continuation<? super Boolean>, ? extends Object> isEnd, @NotNull Function2<? super ServerSentEvent, ? super Continuation<? super Unit>, ? extends Object> block, @NotNull Continuation<? super Unit> $completion) { if (StreamReaderUtilKt.readStream($this$readSse, request, new SSEStreamReader(skipCommentEvent, skipReconnect, isEnd, block), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return StreamReaderUtilKt.readStream($this$readSse, request, new SSEStreamReader(skipCommentEvent, skipReconnect, isEnd, block), $completion);  StreamReaderUtilKt.readStream($this$readSse, request, new SSEStreamReader(skipCommentEvent, skipReconnect, isEnd, block), $completion); return Unit.INSTANCE; }
/*    */ 
/*    */   
/*    */   private static final Object readEvent(ByteReadChannel $this$readEvent, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/utils/http/stream/SSEStreamReaderKt$readEvent$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/utils/http/stream/SSEStreamReaderKt$readEvent$1
/*    */     //   11: astore #5
/*    */     //   13: aload #5
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #5
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 49
/*    */     //   39: new ai/grazie/utils/http/stream/SSEStreamReaderKt$readEvent$1
/*    */     //   42: dup
/*    */     //   43: aload_1
/*    */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   47: astore #5
/*    */     //   49: aload #5
/*    */     //   51: getfield result : Ljava/lang/Object;
/*    */     //   54: astore #4
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #6
/*    */     //   61: aload #5
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 205, 0 -> 88, 1 -> 149
/*    */     //   88: aload #4
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: new ai/grazie/model/cloud/sse/ServerSentEvent$Builder
/*    */     //   96: dup
/*    */     //   97: aconst_null
/*    */     //   98: iconst_1
/*    */     //   99: aconst_null
/*    */     //   100: invokespecial <init> : ([Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   103: astore_2
/*    */     //   104: aload_0
/*    */     //   105: invokeinterface isClosedForRead : ()Z
/*    */     //   110: ifne -> 203
/*    */     //   113: aload_0
/*    */     //   114: iconst_0
/*    */     //   115: aload #5
/*    */     //   117: iconst_1
/*    */     //   118: aconst_null
/*    */     //   119: aload #5
/*    */     //   121: aload_0
/*    */     //   122: putfield L$0 : Ljava/lang/Object;
/*    */     //   125: aload #5
/*    */     //   127: aload_2
/*    */     //   128: putfield L$1 : Ljava/lang/Object;
/*    */     //   131: aload #5
/*    */     //   133: iconst_1
/*    */     //   134: putfield label : I
/*    */     //   137: invokestatic readUTF8Line$default : (Lio/ktor/utils/io/ByteReadChannel;ILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   140: dup
/*    */     //   141: aload #6
/*    */     //   143: if_acmpne -> 174
/*    */     //   146: aload #6
/*    */     //   148: areturn
/*    */     //   149: aload #5
/*    */     //   151: getfield L$1 : Ljava/lang/Object;
/*    */     //   154: checkcast ai/grazie/model/cloud/sse/ServerSentEvent$Builder
/*    */     //   157: astore_2
/*    */     //   158: aload #5
/*    */     //   160: getfield L$0 : Ljava/lang/Object;
/*    */     //   163: checkcast io/ktor/utils/io/ByteReadChannel
/*    */     //   166: astore_0
/*    */     //   167: aload #4
/*    */     //   169: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   172: aload #4
/*    */     //   174: checkcast java/lang/String
/*    */     //   177: dup
/*    */     //   178: ifnonnull -> 185
/*    */     //   181: pop
/*    */     //   182: goto -> 104
/*    */     //   185: astore_3
/*    */     //   186: aload_2
/*    */     //   187: aload_3
/*    */     //   188: invokevirtual append : (Ljava/lang/String;)V
/*    */     //   191: aload_2
/*    */     //   192: invokevirtual isEntire : ()Z
/*    */     //   195: ifeq -> 104
/*    */     //   198: aload_2
/*    */     //   199: invokevirtual build : ()Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */     //   202: areturn
/*    */     //   203: aconst_null
/*    */     //   204: areturn
/*    */     //   205: new java/lang/IllegalStateException
/*    */     //   208: dup
/*    */     //   209: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   211: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   214: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #85	-> 59
/*    */     //   #86	-> 93
/*    */     //   #87	-> 104
/*    */     //   #88	-> 113
/*    */     //   #85	-> 146
/*    */     //   #88	-> 174
/*    */     //   #89	-> 186
/*    */     //   #91	-> 191
/*    */     //   #93	-> 203
/*    */     //   #85	-> 205
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	56	0	$this$readEvent	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   167	38	0	$this$readEvent	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   104	45	2	builder	Lai/grazie/model/cloud/sse/ServerSentEvent$Builder;
/*    */     //   158	47	2	builder	Lai/grazie/model/cloud/sse/ServerSentEvent$Builder;
/*    */     //   186	17	3	line	Ljava/lang/String;
/*    */     //   0	215	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   49	156	5	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	149	4	$result	Ljava/lang/Object;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\stream\SSEStreamReaderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */