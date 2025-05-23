package ai.grazie.utils.http.stream;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\026\020\000\032\0020\0012\006\020\002\032\0020\003H@¢\006\002\020\004\032.\020\005\032\0020\001\"\004\b\000\020\006*\0020\0072\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\002H\0060\013H@¢\006\002\020\f¨\006\r"}, d2 = {"handleExceptionResponse", "", "response", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readStream", "T", "Lio/ktor/client/HttpClient;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "streamReader", "Lai/grazie/utils/http/stream/StreamReader;", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;Lai/grazie/utils/http/stream/StreamReader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-ktor"})
@SourceDebugExtension({"SMAP\nStreamReaderUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamReaderUtil.kt\nai/grazie/utils/http/stream/StreamReaderUtilKt\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,71:1\n52#2:72\n*S KotlinDebug\n*F\n+ 1 StreamReaderUtil.kt\nai/grazie/utils/http/stream/StreamReaderUtilKt\n*L\n27#1:72\n*E\n"})
public final class StreamReaderUtilKt {
  @Nullable
  public static final <T> Object readStream(@NotNull HttpClient $this$readStream, @NotNull HttpRequestBuilder request, @NotNull StreamReader streamReader, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_3
    //   1: instanceof ai/grazie/utils/http/stream/StreamReaderUtilKt$readStream$1
    //   4: ifeq -> 39
    //   7: aload_3
    //   8: checkcast ai/grazie/utils/http/stream/StreamReaderUtilKt$readStream$1
    //   11: astore #8
    //   13: aload #8
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #8
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 49
    //   39: new ai/grazie/utils/http/stream/StreamReaderUtilKt$readStream$1
    //   42: dup
    //   43: aload_3
    //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
    //   47: astore #8
    //   49: aload #8
    //   51: getfield result : Ljava/lang/Object;
    //   54: astore #7
    //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   59: astore #9
    //   61: aload #8
    //   63: getfield label : I
    //   66: tableswitch default -> 450, 0 -> 96, 1 -> 227, 2 -> 318, 3 -> 408
    //   96: aload #7
    //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   101: aload_1
    //   102: astore #4
    //   104: aload #4
    //   106: astore #5
    //   108: iconst_0
    //   109: istore #6
    //   111: aload #5
    //   113: checkcast io/ktor/http/HttpMessageBuilder
    //   116: getstatic io/ktor/http/ContentType$Text.INSTANCE : Lio/ktor/http/ContentType$Text;
    //   119: invokevirtual getEventStream : ()Lio/ktor/http/ContentType;
    //   122: invokestatic accept : (Lio/ktor/http/HttpMessageBuilder;Lio/ktor/http/ContentType;)V
    //   125: aload #5
    //   127: invokevirtual getHeaders : ()Lio/ktor/http/HeadersBuilder;
    //   130: getstatic io/ktor/http/HttpHeaders.INSTANCE : Lio/ktor/http/HttpHeaders;
    //   133: invokevirtual getCacheControl : ()Ljava/lang/String;
    //   136: ldc 'no-cache'
    //   138: invokevirtual append : (Ljava/lang/String;Ljava/lang/String;)V
    //   141: nop
    //   142: nop
    //   143: aload_0
    //   144: checkcast kotlinx/coroutines/CoroutineScope
    //   147: invokestatic isActive : (Lkotlinx/coroutines/CoroutineScope;)Z
    //   150: ifeq -> 446
    //   153: aload_2
    //   154: aload_1
    //   155: invokeinterface beforeConnect : (Lio/ktor/client/request/HttpRequestBuilder;)V
    //   160: aload_0
    //   161: astore #5
    //   163: iconst_0
    //   164: istore #6
    //   166: new io/ktor/client/statement/HttpStatement
    //   169: dup
    //   170: aload_1
    //   171: aload #5
    //   173: invokespecial <init> : (Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V
    //   176: new ai/grazie/utils/http/stream/StreamReaderUtilKt$readStream$ended$1
    //   179: dup
    //   180: aload_0
    //   181: aload_2
    //   182: aconst_null
    //   183: invokespecial <init> : (Lio/ktor/client/HttpClient;Lai/grazie/utils/http/stream/StreamReader;Lkotlin/coroutines/Continuation;)V
    //   186: checkcast kotlin/jvm/functions/Function2
    //   189: aload #8
    //   191: aload #8
    //   193: aload_0
    //   194: putfield L$0 : Ljava/lang/Object;
    //   197: aload #8
    //   199: aload_1
    //   200: putfield L$1 : Ljava/lang/Object;
    //   203: aload #8
    //   205: aload_2
    //   206: putfield L$2 : Ljava/lang/Object;
    //   209: aload #8
    //   211: iconst_1
    //   212: putfield label : I
    //   215: invokevirtual execute : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   218: dup
    //   219: aload #9
    //   221: if_acmpne -> 261
    //   224: aload #9
    //   226: areturn
    //   227: aload #8
    //   229: getfield L$2 : Ljava/lang/Object;
    //   232: checkcast ai/grazie/utils/http/stream/StreamReader
    //   235: astore_2
    //   236: aload #8
    //   238: getfield L$1 : Ljava/lang/Object;
    //   241: checkcast io/ktor/client/request/HttpRequestBuilder
    //   244: astore_1
    //   245: aload #8
    //   247: getfield L$0 : Ljava/lang/Object;
    //   250: checkcast io/ktor/client/HttpClient
    //   253: astore_0
    //   254: aload #7
    //   256: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   259: aload #7
    //   261: checkcast java/lang/Boolean
    //   264: invokevirtual booleanValue : ()Z
    //   267: istore #4
    //   269: iload #4
    //   271: ifeq -> 277
    //   274: goto -> 446
    //   277: aload_2
    //   278: aload #8
    //   280: aload #8
    //   282: aload_0
    //   283: putfield L$0 : Ljava/lang/Object;
    //   286: aload #8
    //   288: aload_1
    //   289: putfield L$1 : Ljava/lang/Object;
    //   292: aload #8
    //   294: aload_2
    //   295: putfield L$2 : Ljava/lang/Object;
    //   298: aload #8
    //   300: iconst_2
    //   301: putfield label : I
    //   304: invokeinterface skipReconnect : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   309: dup
    //   310: aload #9
    //   312: if_acmpne -> 352
    //   315: aload #9
    //   317: areturn
    //   318: aload #8
    //   320: getfield L$2 : Ljava/lang/Object;
    //   323: checkcast ai/grazie/utils/http/stream/StreamReader
    //   326: astore_2
    //   327: aload #8
    //   329: getfield L$1 : Ljava/lang/Object;
    //   332: checkcast io/ktor/client/request/HttpRequestBuilder
    //   335: astore_1
    //   336: aload #8
    //   338: getfield L$0 : Ljava/lang/Object;
    //   341: checkcast io/ktor/client/HttpClient
    //   344: astore_0
    //   345: aload #7
    //   347: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   350: aload #7
    //   352: checkcast java/lang/Boolean
    //   355: invokevirtual booleanValue : ()Z
    //   358: ifeq -> 364
    //   361: goto -> 446
    //   364: aload_2
    //   365: invokeinterface reconnectDelay : ()J
    //   370: aload #8
    //   372: aload #8
    //   374: aload_0
    //   375: putfield L$0 : Ljava/lang/Object;
    //   378: aload #8
    //   380: aload_1
    //   381: putfield L$1 : Ljava/lang/Object;
    //   384: aload #8
    //   386: aload_2
    //   387: putfield L$2 : Ljava/lang/Object;
    //   390: aload #8
    //   392: iconst_3
    //   393: putfield label : I
    //   396: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   399: dup
    //   400: aload #9
    //   402: if_acmpne -> 442
    //   405: aload #9
    //   407: areturn
    //   408: aload #8
    //   410: getfield L$2 : Ljava/lang/Object;
    //   413: checkcast ai/grazie/utils/http/stream/StreamReader
    //   416: astore_2
    //   417: aload #8
    //   419: getfield L$1 : Ljava/lang/Object;
    //   422: checkcast io/ktor/client/request/HttpRequestBuilder
    //   425: astore_1
    //   426: aload #8
    //   428: getfield L$0 : Ljava/lang/Object;
    //   431: checkcast io/ktor/client/HttpClient
    //   434: astore_0
    //   435: aload #7
    //   437: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   440: aload #7
    //   442: pop
    //   443: goto -> 143
    //   446: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   449: areturn
    //   450: new java/lang/IllegalStateException
    //   453: dup
    //   454: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   456: invokespecial <init> : (Ljava/lang/String;)V
    //   459: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #15	-> 59
    //   #19	-> 101
    //   #20	-> 111
    //   #21	-> 125
    //   #22	-> 141
    //   #19	-> 142
    //   #24	-> 143
    //   #25	-> 153
    //   #27	-> 160
    //   #72	-> 166
    //   #27	-> 176
    //   #15	-> 224
    //   #27	-> 261
    //   #40	-> 269
    //   #41	-> 274
    //   #43	-> 277
    //   #15	-> 315
    //   #43	-> 352
    //   #44	-> 361
    //   #46	-> 364
    //   #15	-> 405
    //   #46	-> 442
    //   #49	-> 446
    //   #15	-> 450
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   101	41	0	$this$readStream	Lio/ktor/client/HttpClient;
    //   142	1	0	$this$readStream	Lio/ktor/client/HttpClient;
    //   143	84	0	$this$readStream	Lio/ktor/client/HttpClient;
    //   254	64	0	$this$readStream	Lio/ktor/client/HttpClient;
    //   345	63	0	$this$readStream	Lio/ktor/client/HttpClient;
    //   435	11	0	$this$readStream	Lio/ktor/client/HttpClient;
    //   101	41	1	request	Lio/ktor/client/request/HttpRequestBuilder;
    //   142	1	1	request	Lio/ktor/client/request/HttpRequestBuilder;
    //   143	84	1	request	Lio/ktor/client/request/HttpRequestBuilder;
    //   245	73	1	request	Lio/ktor/client/request/HttpRequestBuilder;
    //   336	72	1	request	Lio/ktor/client/request/HttpRequestBuilder;
    //   426	20	1	request	Lio/ktor/client/request/HttpRequestBuilder;
    //   101	41	2	streamReader	Lai/grazie/utils/http/stream/StreamReader;
    //   142	1	2	streamReader	Lai/grazie/utils/http/stream/StreamReader;
    //   143	84	2	streamReader	Lai/grazie/utils/http/stream/StreamReader;
    //   236	82	2	streamReader	Lai/grazie/utils/http/stream/StreamReader;
    //   327	81	2	streamReader	Lai/grazie/utils/http/stream/StreamReader;
    //   417	29	2	streamReader	Lai/grazie/utils/http/stream/StreamReader;
    //   269	5	4	ended	Z
    //   108	34	5	$this$readStream_u24lambda_u240	Lio/ktor/client/request/HttpRequestBuilder;
    //   163	13	5	$this$prepareRequest$iv	Lio/ktor/client/HttpClient;
    //   111	31	6	$i$a$-apply-StreamReaderUtilKt$readStream$2	I
    //   166	10	6	$i$f$prepareRequest	I
    //   0	460	3	$completion	Lkotlin/coroutines/Continuation;
    //   49	401	8	$continuation	Lkotlin/coroutines/Continuation;
    //   56	394	7	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "StreamReaderUtil.kt", l = {59, 66}, i = {0}, s = {"L$0"}, n = {"response"}, m = "handleExceptionResponse", c = "ai.grazie.utils.http.stream.StreamReaderUtilKt")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class StreamReaderUtilKt$handleExceptionResponse$1 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    StreamReaderUtilKt$handleExceptionResponse$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return StreamReaderUtilKt.handleExceptionResponse(null, (Continuation)this);
    }
  }
  
  @DebugMetadata(f = "StreamReaderUtil.kt", l = {27, 43, 46}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"$this$readStream", "request", "streamReader", "$this$readStream", "request", "streamReader", "$this$readStream", "request", "streamReader"}, m = "readStream", c = "ai.grazie.utils.http.stream.StreamReaderUtilKt")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class StreamReaderUtilKt$readStream$1<T> extends ContinuationImpl {
    Object L$0;
    
    Object L$1;
    
    Object L$2;
    
    int label;
    
    StreamReaderUtilKt$readStream$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return StreamReaderUtilKt.readStream(null, null, null, (Continuation<? super Unit>)this);
    }
  }
  
  @DebugMetadata(f = "StreamReaderUtil.kt", l = {28, 30, 32, 33, 36}, i = {0, 2, 3, 3, 4}, s = {"L$0", "L$0", "L$0", "L$1", "L$0"}, n = {"response", "channel", "channel", "event", "channel"}, m = "invokeSuspend", c = "ai.grazie.utils.http.stream.StreamReaderUtilKt$readStream$ended$1")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\013\n\002\b\002\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\004H@"}, d2 = {"<anonymous>", "", "T", "response", "Lio/ktor/client/statement/HttpResponse;"})
  static final class StreamReaderUtilKt$readStream$ended$1 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super Boolean>, Object> {
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
  
  private static final Object handleExceptionResponse(HttpResponse response, Continuation $completion) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof ai/grazie/utils/http/stream/StreamReaderUtilKt$handleExceptionResponse$1
    //   4: ifeq -> 39
    //   7: aload_1
    //   8: checkcast ai/grazie/utils/http/stream/StreamReaderUtilKt$handleExceptionResponse$1
    //   11: astore #9
    //   13: aload #9
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #9
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 49
    //   39: new ai/grazie/utils/http/stream/StreamReaderUtilKt$handleExceptionResponse$1
    //   42: dup
    //   43: aload_1
    //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
    //   47: astore #9
    //   49: aload #9
    //   51: getfield result : Ljava/lang/Object;
    //   54: astore #8
    //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   59: astore #10
    //   61: aload #9
    //   63: getfield label : I
    //   66: tableswitch default -> 266, 0 -> 92, 1 -> 178, 2 -> 253
    //   92: aload #8
    //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   97: aload_0
    //   98: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
    //   101: astore_2
    //   102: aload_2
    //   103: invokestatic isSuccess : (Lio/ktor/http/HttpStatusCode;)Z
    //   106: ifeq -> 113
    //   109: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   112: areturn
    //   113: aload_2
    //   114: invokevirtual getValue : ()I
    //   117: istore #4
    //   119: sipush #300
    //   122: iload #4
    //   124: if_icmpgt -> 143
    //   127: iload #4
    //   129: sipush #400
    //   132: if_icmpge -> 139
    //   135: iconst_1
    //   136: goto -> 144
    //   139: iconst_0
    //   140: goto -> 144
    //   143: iconst_0
    //   144: ifeq -> 229
    //   147: nop
    //   148: aload_0
    //   149: aconst_null
    //   150: aload #9
    //   152: iconst_1
    //   153: aconst_null
    //   154: aload #9
    //   156: aload_0
    //   157: putfield L$0 : Ljava/lang/Object;
    //   160: aload #9
    //   162: iconst_1
    //   163: putfield label : I
    //   166: invokestatic bodyAsText$default : (Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   169: dup
    //   170: aload #10
    //   172: if_acmpne -> 195
    //   175: aload #10
    //   177: areturn
    //   178: aload #9
    //   180: getfield L$0 : Ljava/lang/Object;
    //   183: checkcast io/ktor/client/statement/HttpResponse
    //   186: astore_0
    //   187: nop
    //   188: aload #8
    //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   193: aload #8
    //   195: checkcast java/lang/String
    //   198: astore #6
    //   200: goto -> 209
    //   203: astore #7
    //   205: ldc '<body failed decoding>'
    //   207: astore #6
    //   209: aload #6
    //   211: astore #5
    //   213: new io/ktor/client/plugins/RedirectResponseException
    //   216: dup
    //   217: aload_0
    //   218: aload #5
    //   220: invokespecial <init> : (Lio/ktor/client/statement/HttpResponse;Ljava/lang/String;)V
    //   223: checkcast java/lang/RuntimeException
    //   226: goto -> 263
    //   229: getstatic ai/grazie/model/cloud/exceptions/HttpExceptionBase.Companion : Lai/grazie/model/cloud/exceptions/HttpExceptionBase$Companion;
    //   232: aload_0
    //   233: aload #9
    //   235: aload #9
    //   237: iconst_2
    //   238: putfield label : I
    //   241: invokestatic of : (Lai/grazie/model/cloud/exceptions/HttpExceptionBase$Companion;Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   244: dup
    //   245: aload #10
    //   247: if_acmpne -> 260
    //   250: aload #10
    //   252: areturn
    //   253: aload #8
    //   255: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   258: aload #8
    //   260: checkcast java/lang/RuntimeException
    //   263: astore_3
    //   264: aload_3
    //   265: athrow
    //   266: new java/lang/IllegalStateException
    //   269: dup
    //   270: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   272: invokespecial <init> : (Ljava/lang/String;)V
    //   275: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #51	-> 59
    //   #52	-> 97
    //   #53	-> 102
    //   #54	-> 109
    //   #56	-> 113
    //   #57	-> 119
    //   #58	-> 147
    //   #59	-> 148
    //   #51	-> 175
    //   #59	-> 195
    //   #60	-> 203
    //   #61	-> 205
    //   #58	-> 209
    //   #63	-> 213
    //   #66	-> 229
    //   #51	-> 250
    //   #56	-> 263
    //   #69	-> 264
    //   #51	-> 266
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   97	12	0	response	Lio/ktor/client/statement/HttpResponse;
    //   113	65	0	response	Lio/ktor/client/statement/HttpResponse;
    //   187	36	0	response	Lio/ktor/client/statement/HttpResponse;
    //   229	15	0	response	Lio/ktor/client/statement/HttpResponse;
    //   102	7	2	statusCode	Lio/ktor/http/HttpStatusCode;
    //   113	6	2	statusCode	Lio/ktor/http/HttpStatusCode;
    //   264	2	3	exception	Ljava/lang/RuntimeException;
    //   213	10	5	exceptionResponseText	Ljava/lang/String;
    //   0	276	1	$completion	Lkotlin/coroutines/Continuation;
    //   49	217	9	$continuation	Lkotlin/coroutines/Continuation;
    //   56	210	8	$result	Ljava/lang/Object;
    // Exception table:
    //   from	to	target	type
    //   147	169	203	io/ktor/utils/io/charsets/MalformedInputException
    //   187	200	203	io/ktor/utils/io/charsets/MalformedInputException
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\stream\StreamReaderUtilKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */