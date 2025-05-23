package ai.grazie.utils.http.stream;

import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@DebugMetadata(f = "StreamReaderUtil.kt", l = {28, 30, 32, 33, 36}, i = {0, 2, 3, 3, 4}, s = {"L$0", "L$0", "L$0", "L$1", "L$0"}, n = {"response", "channel", "channel", "event", "channel"}, m = "invokeSuspend", c = "ai.grazie.utils.http.stream.StreamReaderUtilKt$readStream$ended$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\013\n\002\b\002\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\004H@"}, d2 = {"<anonymous>", "", "T", "response", "Lio/ktor/client/statement/HttpResponse;"})
final class StreamReaderUtilKt$readStream$ended$1 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super Boolean>, Object> {
  Object L$1;
  
  int label;
  
  StreamReaderUtilKt$readStream$ended$1(HttpClient $receiver, StreamReader<T> $streamReader, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 351, 0 -> 48, 1 -> 87, 2 -> 128, 3 -> 192, 4 -> 257, 5 -> 329
    //   48: aload_1
    //   49: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   52: aload_0
    //   53: getfield L$0 : Ljava/lang/Object;
    //   56: checkcast io/ktor/client/statement/HttpResponse
    //   59: astore_2
    //   60: aload_2
    //   61: aload_0
    //   62: checkcast kotlin/coroutines/Continuation
    //   65: aload_0
    //   66: aload_2
    //   67: putfield L$0 : Ljava/lang/Object;
    //   70: aload_0
    //   71: iconst_1
    //   72: putfield label : I
    //   75: invokestatic access$handleExceptionResponse : (Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   78: dup
    //   79: aload #5
    //   81: if_acmpne -> 100
    //   84: aload #5
    //   86: areturn
    //   87: aload_0
    //   88: getfield L$0 : Ljava/lang/Object;
    //   91: checkcast io/ktor/client/statement/HttpResponse
    //   94: astore_2
    //   95: aload_1
    //   96: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   99: aload_1
    //   100: pop
    //   101: aload_2
    //   102: aload_0
    //   103: checkcast kotlin/coroutines/Continuation
    //   106: aload_0
    //   107: aconst_null
    //   108: putfield L$0 : Ljava/lang/Object;
    //   111: aload_0
    //   112: iconst_2
    //   113: putfield label : I
    //   116: invokestatic bodyAsChannel : (Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   119: dup
    //   120: aload #5
    //   122: if_acmpne -> 133
    //   125: aload #5
    //   127: areturn
    //   128: aload_1
    //   129: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   132: aload_1
    //   133: checkcast io/ktor/utils/io/ByteReadChannel
    //   136: astore_3
    //   137: aload_0
    //   138: getfield $this_readStream : Lio/ktor/client/HttpClient;
    //   141: checkcast kotlinx/coroutines/CoroutineScope
    //   144: invokestatic isActive : (Lkotlinx/coroutines/CoroutineScope;)Z
    //   147: ifeq -> 346
    //   150: aload_3
    //   151: invokeinterface isClosedForRead : ()Z
    //   156: ifne -> 346
    //   159: aload_0
    //   160: getfield $streamReader : Lai/grazie/utils/http/stream/StreamReader;
    //   163: aload_3
    //   164: aload_0
    //   165: checkcast kotlin/coroutines/Continuation
    //   168: aload_0
    //   169: aload_3
    //   170: putfield L$0 : Ljava/lang/Object;
    //   173: aload_0
    //   174: iconst_3
    //   175: putfield label : I
    //   178: invokeinterface readEvent : (Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   183: dup
    //   184: aload #5
    //   186: if_acmpne -> 205
    //   189: aload #5
    //   191: areturn
    //   192: aload_0
    //   193: getfield L$0 : Ljava/lang/Object;
    //   196: checkcast io/ktor/utils/io/ByteReadChannel
    //   199: astore_3
    //   200: aload_1
    //   201: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   204: aload_1
    //   205: dup
    //   206: ifnonnull -> 215
    //   209: pop
    //   210: iconst_0
    //   211: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
    //   214: areturn
    //   215: astore #4
    //   217: aload_0
    //   218: getfield $streamReader : Lai/grazie/utils/http/stream/StreamReader;
    //   221: aload #4
    //   223: aload_0
    //   224: checkcast kotlin/coroutines/Continuation
    //   227: aload_0
    //   228: aload_3
    //   229: putfield L$0 : Ljava/lang/Object;
    //   232: aload_0
    //   233: aload #4
    //   235: putfield L$1 : Ljava/lang/Object;
    //   238: aload_0
    //   239: iconst_4
    //   240: putfield label : I
    //   243: invokeinterface isLastEvent : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   248: dup
    //   249: aload #5
    //   251: if_acmpne -> 276
    //   254: aload #5
    //   256: areturn
    //   257: aload_0
    //   258: getfield L$1 : Ljava/lang/Object;
    //   261: astore #4
    //   263: aload_0
    //   264: getfield L$0 : Ljava/lang/Object;
    //   267: checkcast io/ktor/utils/io/ByteReadChannel
    //   270: astore_3
    //   271: aload_1
    //   272: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   275: aload_1
    //   276: checkcast java/lang/Boolean
    //   279: invokevirtual booleanValue : ()Z
    //   282: ifeq -> 290
    //   285: iconst_1
    //   286: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
    //   289: areturn
    //   290: aload_0
    //   291: getfield $streamReader : Lai/grazie/utils/http/stream/StreamReader;
    //   294: aload #4
    //   296: aload_0
    //   297: checkcast kotlin/coroutines/Continuation
    //   300: aload_0
    //   301: aload_3
    //   302: putfield L$0 : Ljava/lang/Object;
    //   305: aload_0
    //   306: aconst_null
    //   307: putfield L$1 : Ljava/lang/Object;
    //   310: aload_0
    //   311: iconst_5
    //   312: putfield label : I
    //   315: invokeinterface processEvent : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   320: dup
    //   321: aload #5
    //   323: if_acmpne -> 342
    //   326: aload #5
    //   328: areturn
    //   329: aload_0
    //   330: getfield L$0 : Ljava/lang/Object;
    //   333: checkcast io/ktor/utils/io/ByteReadChannel
    //   336: astore_3
    //   337: aload_1
    //   338: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   341: aload_1
    //   342: pop
    //   343: goto -> 137
    //   346: iconst_0
    //   347: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
    //   350: areturn
    //   351: new java/lang/IllegalStateException
    //   354: dup
    //   355: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   357: invokespecial <init> : (Ljava/lang/String;)V
    //   360: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #27	-> 3
    //   #28	-> 60
    //   #27	-> 84
    //   #30	-> 100
    //   #27	-> 125
    //   #31	-> 137
    //   #32	-> 159
    //   #27	-> 189
    //   #32	-> 205
    //   #33	-> 217
    //   #27	-> 254
    //   #33	-> 276
    //   #34	-> 285
    //   #36	-> 290
    //   #27	-> 326
    //   #36	-> 342
    //   #38	-> 346
    //   #27	-> 351
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   60	27	2	response	Lio/ktor/client/statement/HttpResponse;
    //   95	24	2	response	Lio/ktor/client/statement/HttpResponse;
    //   137	55	3	channel	Lio/ktor/utils/io/ByteReadChannel;
    //   200	57	3	channel	Lio/ktor/utils/io/ByteReadChannel;
    //   271	58	3	channel	Lio/ktor/utils/io/ByteReadChannel;
    //   337	9	3	channel	Lio/ktor/utils/io/ByteReadChannel;
    //   217	40	4	event	Ljava/lang/Object;
    //   263	22	4	event	Ljava/lang/Object;
    //   290	30	4	event	Ljava/lang/Object;
    //   0	361	0	this	Lai/grazie/utils/http/stream/StreamReaderUtilKt$readStream$ended$1;
    //   52	299	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super StreamReaderUtilKt$readStream$ended$1> $completion) {
    StreamReaderUtilKt$readStream$ended$1 streamReaderUtilKt$readStream$ended$1 = new StreamReaderUtilKt$readStream$ended$1(this.$this_readStream, this.$streamReader, $completion);
    streamReaderUtilKt$readStream$ended$1.L$0 = value;
    return (Continuation<Unit>)streamReaderUtilKt$readStream$ended$1;
  }
  
  public final Object invoke(HttpResponse p1, Continuation<?> p2) {
    return ((StreamReaderUtilKt$readStream$ended$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\stream\StreamReaderUtilKt$readStream$ended$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */