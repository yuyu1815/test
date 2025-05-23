/*    */ package ai.grazie.utils.http.stream;
/*    */ 
/*    */ import io.ktor.client.HttpClient;
/*    */ import io.ktor.client.request.HttpRequestBuilder;
/*    */ import io.ktor.utils.io.ByteReadChannel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\0008\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\002\032R\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\"\020\005\032\036\b\001\022\004\022\0020\007\022\n\022\b\022\004\022\0020\0010\b\022\006\022\004\030\0010\t0\0062\022\020\n\032\016\022\004\022\0020\007\022\004\022\0020\f0\013H@¢\006\002\020\r\032\024\020\016\032\004\030\0010\007*\0020\017H@¢\006\002\020\020¨\006\021"}, d2 = {"readLineStream", "", "Lio/ktor/client/HttpClient;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "isLastLine", "Lkotlin/Function1;", "", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readNextLine", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-ktor"})
/*    */ public final class LineStreamReaderKt {
/*    */   @Nullable
/*    */   public static final Object readLineStream(@NotNull HttpClient $this$readLineStream, @NotNull HttpRequestBuilder request, @NotNull Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> block, @NotNull Function1<? super String, Boolean> isLastLine, @NotNull Continuation<? super Unit> $completion) {
/* 21 */     if (StreamReaderUtilKt.readStream($this$readLineStream, request, new LineStreamReader(block, isLastLine), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return StreamReaderUtilKt.readStream($this$readLineStream, request, new LineStreamReader(block, isLastLine), $completion);  StreamReaderUtilKt.readStream($this$readLineStream, request, new LineStreamReader(block, isLastLine), $completion); return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Object readNextLine(ByteReadChannel $this$readNextLine, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/utils/http/stream/LineStreamReaderKt$readNextLine$1
/*    */     //   4: ifeq -> 36
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/utils/http/stream/LineStreamReaderKt$readNextLine$1
/*    */     //   11: astore_3
/*    */     //   12: aload_3
/*    */     //   13: getfield label : I
/*    */     //   16: ldc -2147483648
/*    */     //   18: iand
/*    */     //   19: ifeq -> 36
/*    */     //   22: aload_3
/*    */     //   23: dup
/*    */     //   24: getfield label : I
/*    */     //   27: ldc -2147483648
/*    */     //   29: isub
/*    */     //   30: putfield label : I
/*    */     //   33: goto -> 45
/*    */     //   36: new ai/grazie/utils/http/stream/LineStreamReaderKt$readNextLine$1
/*    */     //   39: dup
/*    */     //   40: aload_1
/*    */     //   41: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   44: astore_3
/*    */     //   45: aload_3
/*    */     //   46: getfield result : Ljava/lang/Object;
/*    */     //   49: astore_2
/*    */     //   50: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   53: astore #4
/*    */     //   55: aload_3
/*    */     //   56: getfield label : I
/*    */     //   59: tableswitch default -> 147, 0 -> 80, 1 -> 120
/*    */     //   80: aload_2
/*    */     //   81: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   84: aload_0
/*    */     //   85: invokeinterface isClosedForRead : ()Z
/*    */     //   90: ifne -> 145
/*    */     //   93: aload_0
/*    */     //   94: iconst_0
/*    */     //   95: aload_3
/*    */     //   96: iconst_1
/*    */     //   97: aconst_null
/*    */     //   98: aload_3
/*    */     //   99: aload_0
/*    */     //   100: putfield L$0 : Ljava/lang/Object;
/*    */     //   103: aload_3
/*    */     //   104: iconst_1
/*    */     //   105: putfield label : I
/*    */     //   108: invokestatic readUTF8Line$default : (Lio/ktor/utils/io/ByteReadChannel;ILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   111: dup
/*    */     //   112: aload #4
/*    */     //   114: if_acmpne -> 133
/*    */     //   117: aload #4
/*    */     //   119: areturn
/*    */     //   120: aload_3
/*    */     //   121: getfield L$0 : Ljava/lang/Object;
/*    */     //   124: checkcast io/ktor/utils/io/ByteReadChannel
/*    */     //   127: astore_0
/*    */     //   128: aload_2
/*    */     //   129: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   132: aload_2
/*    */     //   133: checkcast java/lang/String
/*    */     //   136: dup
/*    */     //   137: ifnonnull -> 144
/*    */     //   140: pop
/*    */     //   141: goto -> 84
/*    */     //   144: areturn
/*    */     //   145: aconst_null
/*    */     //   146: areturn
/*    */     //   147: new java/lang/IllegalStateException
/*    */     //   150: dup
/*    */     //   151: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   153: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   156: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #53	-> 53
/*    */     //   #54	-> 84
/*    */     //   #55	-> 93
/*    */     //   #53	-> 117
/*    */     //   #55	-> 133
/*    */     //   #57	-> 145
/*    */     //   #53	-> 147
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   84	36	0	$this$readNextLine	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   128	19	0	$this$readNextLine	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   0	157	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   45	102	3	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   50	97	2	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LineStreamReader.kt", l = {55}, i = {0}, s = {"L$0"}, n = {"$this$readNextLine"}, m = "readNextLine", c = "ai.grazie.utils.http.stream.LineStreamReaderKt")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LineStreamReaderKt$readNextLine$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     LineStreamReaderKt$readNextLine$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LineStreamReaderKt.readNextLine(null, (Continuation)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\stream\LineStreamReaderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */