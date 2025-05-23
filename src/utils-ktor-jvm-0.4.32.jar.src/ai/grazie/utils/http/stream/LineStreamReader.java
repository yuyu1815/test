/*    */ package ai.grazie.utils.http.stream;
/*    */ 
/*    */ import io.ktor.client.request.HttpRequestBuilder;
/*    */ import io.ktor.utils.io.ByteReadChannel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.Boxing;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\020\000\n\000\n\002\030\002\n\002\020\013\n\002\b\007\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\004\b\002\030\0002\b\022\004\022\0020\0020\001B=\022\"\020\003\032\036\b\001\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0060\005\022\006\022\004\030\0010\0070\004\022\022\020\b\032\016\022\004\022\0020\002\022\004\022\0020\n0\t¢\006\002\020\013J\020\020\020\032\0020\0062\006\020\021\032\0020\022H\026J\026\020\023\032\0020\n2\006\020\024\032\0020\002H@¢\006\002\020\025J\026\020\026\032\0020\0062\006\020\024\032\0020\002H@¢\006\002\020\025J\030\020\027\032\004\030\0010\0022\006\020\030\032\0020\031H@¢\006\002\020\032J\016\020\033\032\0020\nH@¢\006\002\020\034R/\020\003\032\036\b\001\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0060\005\022\006\022\004\030\0010\0070\004¢\006\n\n\002\020\016\032\004\b\f\020\rR\035\020\b\032\016\022\004\022\0020\002\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\b\020\017¨\006\035"}, d2 = {"Lai/grazie/utils/http/stream/LineStreamReader;", "Lai/grazie/utils/http/stream/StreamReader;", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "isEnd", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getBlock", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function1;", "beforeConnect", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "isLastEvent", "event", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processEvent", "readEvent", "channel", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "skipReconnect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-ktor"})
/*    */ final class LineStreamReader implements StreamReader<String> {
/*    */   @NotNull
/*    */   private final Function2<String, Continuation<? super Unit>, Object> block;
/*    */   @NotNull
/*    */   private final Function1<String, Boolean> isEnd;
/*    */   
/*    */   @NotNull
/*    */   public final Function2<String, Continuation<? super Unit>, Object> getBlock() {
/*    */     return this.block;
/*    */   }
/*    */   
/* 29 */   public LineStreamReader(@NotNull Function2<String, Continuation<? super Unit>, Object> block, @NotNull Function1<String, Boolean> isEnd) { this.block = block;
/* 30 */     this.isEnd = isEnd; } @NotNull public final Function1<String, Boolean> isEnd() { return this.isEnd; }
/*    */    public void beforeConnect(@NotNull HttpRequestBuilder request) {
/* 32 */     Intrinsics.checkNotNullParameter(request, "request");
/*    */   } @Nullable
/*    */   public Object readEvent(@NotNull ByteReadChannel channel, @NotNull Continuation $completion) {
/* 35 */     return LineStreamReaderKt.access$readNextLine(channel, $completion);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object isLastEvent(@NotNull String event, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/utils/http/stream/LineStreamReader$isLastEvent$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/utils/http/stream/LineStreamReader$isLastEvent$1
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
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/utils/http/stream/LineStreamReader$isLastEvent$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/utils/http/stream/LineStreamReader;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #5
/*    */     //   50: aload #5
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #4
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #6
/*    */     //   62: aload #5
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 174, 0 -> 88, 1 -> 147
/*    */     //   88: aload #4
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: getfield isEnd : Lkotlin/jvm/functions/Function1;
/*    */     //   97: aload_1
/*    */     //   98: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   103: checkcast java/lang/Boolean
/*    */     //   106: invokevirtual booleanValue : ()Z
/*    */     //   109: istore_3
/*    */     //   110: iload_3
/*    */     //   111: ifeq -> 161
/*    */     //   114: aload_0
/*    */     //   115: getfield block : Lkotlin/jvm/functions/Function2;
/*    */     //   118: aload_1
/*    */     //   119: aload #5
/*    */     //   121: aload #5
/*    */     //   123: iload_3
/*    */     //   124: putfield Z$0 : Z
/*    */     //   127: aload #5
/*    */     //   129: iconst_1
/*    */     //   130: putfield label : I
/*    */     //   133: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   138: dup
/*    */     //   139: aload #6
/*    */     //   141: if_acmpne -> 160
/*    */     //   144: aload #6
/*    */     //   146: areturn
/*    */     //   147: aload #5
/*    */     //   149: getfield Z$0 : Z
/*    */     //   152: istore_3
/*    */     //   153: aload #4
/*    */     //   155: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   158: aload #4
/*    */     //   160: pop
/*    */     //   161: iload_3
/*    */     //   162: ifeq -> 169
/*    */     //   165: iconst_1
/*    */     //   166: goto -> 170
/*    */     //   169: iconst_0
/*    */     //   170: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   173: areturn
/*    */     //   174: new java/lang/IllegalStateException
/*    */     //   177: dup
/*    */     //   178: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   180: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   183: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 60
/*    */     //   #39	-> 93
/*    */     //   #40	-> 110
/*    */     //   #41	-> 114
/*    */     //   #38	-> 144
/*    */     //   #43	-> 160
/*    */     //   #38	-> 174
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	45	0	this	Lai/grazie/utils/http/stream/LineStreamReader;
/*    */     //   93	45	1	event	Ljava/lang/String;
/*    */     //   110	37	3	isEnd	Z
/*    */     //   153	16	3	isEnd	Z
/*    */     //   0	184	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	124	5	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	117	4	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object processEvent(@NotNull String event, @NotNull Continuation $completion) {
/* 47 */     if (this.block.invoke(event, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.block.invoke(event, $completion);  this.block.invoke(event, $completion); return Unit.INSTANCE;
/*    */   } @Nullable
/*    */   public Object skipReconnect(@NotNull Continuation $completion) {
/* 50 */     return Boxing.boxBoolean(true);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LineStreamReader.kt", l = {41}, i = {0}, s = {"Z$0"}, n = {"isEnd"}, m = "isLastEvent", c = "ai.grazie.utils.http.stream.LineStreamReader")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LineStreamReader$isLastEvent$1 extends ContinuationImpl {
/*    */     boolean Z$0;
/*    */     int label;
/*    */     
/*    */     LineStreamReader$isLastEvent$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LineStreamReader.this.isLastEvent((String)null, (Continuation<? super Boolean>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\stream\LineStreamReader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */