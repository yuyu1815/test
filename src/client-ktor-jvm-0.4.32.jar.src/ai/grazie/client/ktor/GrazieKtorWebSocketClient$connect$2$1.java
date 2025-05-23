package ai.grazie.client.ktor;

import ai.grazie.client.common.websocket.SuspendableWebSocketClient;
import io.ktor.websocket.Frame;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;

@DebugMetadata(f = "GrazieKtorWebSocketClient.kt", l = {43, 45, 46, 47}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.ktor.GrazieKtorWebSocketClient$connect$2$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class null extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  Object L$0;
  
  int label;
  
  null(Channel<SuspendableWebSocketClient.Frame> $outgoingTransformed, SendChannel<Frame> $outgoing, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 340, 0 -> 44, 1 -> 88, 2 -> 176, 3 -> 248, 4 -> 313
    //   44: aload_1
    //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   48: nop
    //   49: aload_0
    //   50: getfield $outgoingTransformed : Lkotlinx/coroutines/channels/Channel;
    //   53: invokeinterface iterator : ()Lkotlinx/coroutines/channels/ChannelIterator;
    //   58: astore_2
    //   59: aload_2
    //   60: aload_0
    //   61: checkcast kotlin/coroutines/Continuation
    //   64: aload_0
    //   65: aload_2
    //   66: putfield L$0 : Ljava/lang/Object;
    //   69: aload_0
    //   70: iconst_1
    //   71: putfield label : I
    //   74: invokeinterface hasNext : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   79: dup
    //   80: aload #5
    //   82: if_acmpne -> 102
    //   85: aload #5
    //   87: areturn
    //   88: aload_0
    //   89: getfield L$0 : Ljava/lang/Object;
    //   92: checkcast kotlinx/coroutines/channels/ChannelIterator
    //   95: astore_2
    //   96: nop
    //   97: aload_1
    //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   101: aload_1
    //   102: checkcast java/lang/Boolean
    //   105: invokevirtual booleanValue : ()Z
    //   108: ifeq -> 336
    //   111: aload_2
    //   112: invokeinterface next : ()Ljava/lang/Object;
    //   117: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame
    //   120: astore_3
    //   121: aload_3
    //   122: astore #4
    //   124: aload #4
    //   126: instanceof ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Binary
    //   129: ifeq -> 194
    //   132: aload_0
    //   133: getfield $outgoing : Lkotlinx/coroutines/channels/SendChannel;
    //   136: new io/ktor/websocket/Frame$Binary
    //   139: dup
    //   140: iconst_1
    //   141: aload_3
    //   142: invokevirtual getData : ()[B
    //   145: invokespecial <init> : (Z[B)V
    //   148: aload_0
    //   149: checkcast kotlin/coroutines/Continuation
    //   152: aload_0
    //   153: aload_2
    //   154: putfield L$0 : Ljava/lang/Object;
    //   157: aload_0
    //   158: iconst_2
    //   159: putfield label : I
    //   162: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   167: dup
    //   168: aload #5
    //   170: if_acmpne -> 190
    //   173: aload #5
    //   175: areturn
    //   176: aload_0
    //   177: getfield L$0 : Ljava/lang/Object;
    //   180: checkcast kotlinx/coroutines/channels/ChannelIterator
    //   183: astore_2
    //   184: nop
    //   185: aload_1
    //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   189: aload_1
    //   190: pop
    //   191: goto -> 59
    //   194: aload #4
    //   196: instanceof ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Text
    //   199: ifeq -> 266
    //   202: aload_0
    //   203: getfield $outgoing : Lkotlinx/coroutines/channels/SendChannel;
    //   206: new io/ktor/websocket/Frame$Text
    //   209: dup
    //   210: aload_3
    //   211: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Text
    //   214: invokevirtual getText : ()Ljava/lang/String;
    //   217: invokespecial <init> : (Ljava/lang/String;)V
    //   220: aload_0
    //   221: checkcast kotlin/coroutines/Continuation
    //   224: aload_0
    //   225: aload_2
    //   226: putfield L$0 : Ljava/lang/Object;
    //   229: aload_0
    //   230: iconst_3
    //   231: putfield label : I
    //   234: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   239: dup
    //   240: aload #5
    //   242: if_acmpne -> 262
    //   245: aload #5
    //   247: areturn
    //   248: aload_0
    //   249: getfield L$0 : Ljava/lang/Object;
    //   252: checkcast kotlinx/coroutines/channels/ChannelIterator
    //   255: astore_2
    //   256: nop
    //   257: aload_1
    //   258: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   261: aload_1
    //   262: pop
    //   263: goto -> 59
    //   266: aload #4
    //   268: instanceof ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Close
    //   271: ifeq -> 59
    //   274: aload_0
    //   275: getfield $outgoing : Lkotlinx/coroutines/channels/SendChannel;
    //   278: new io/ktor/websocket/Frame$Close
    //   281: dup
    //   282: invokespecial <init> : ()V
    //   285: aload_0
    //   286: checkcast kotlin/coroutines/Continuation
    //   289: aload_0
    //   290: aload_2
    //   291: putfield L$0 : Ljava/lang/Object;
    //   294: aload_0
    //   295: iconst_4
    //   296: putfield label : I
    //   299: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   304: dup
    //   305: aload #5
    //   307: if_acmpne -> 327
    //   310: aload #5
    //   312: areturn
    //   313: aload_0
    //   314: getfield L$0 : Ljava/lang/Object;
    //   317: checkcast kotlinx/coroutines/channels/ChannelIterator
    //   320: astore_2
    //   321: nop
    //   322: aload_1
    //   323: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   326: aload_1
    //   327: pop
    //   328: goto -> 59
    //   331: astore_2
    //   332: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   335: areturn
    //   336: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   339: areturn
    //   340: new java/lang/IllegalStateException
    //   343: dup
    //   344: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   346: invokespecial <init> : (Ljava/lang/String;)V
    //   349: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #41	-> 3
    //   #42	-> 48
    //   #43	-> 49
    //   #41	-> 85
    //   #43	-> 102
    //   #44	-> 121
    //   #45	-> 124
    //   #41	-> 173
    //   #45	-> 190
    //   #46	-> 194
    //   #41	-> 245
    //   #46	-> 262
    //   #47	-> 266
    //   #41	-> 310
    //   #47	-> 327
    //   #50	-> 331
    //   #51	-> 332
    //   #53	-> 336
    //   #41	-> 340
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   121	46	3	value	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;
    //   194	45	3	value	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;
    //   0	350	0	this	Lai/grazie/client/ktor/GrazieKtorWebSocketClient$connect$2$1;
    //   48	292	1	$result	Ljava/lang/Object;
    // Exception table:
    //   from	to	target	type
    //   48	79	331	java/io/EOFException
    //   96	167	331	java/io/EOFException
    //   184	239	331	java/io/EOFException
    //   256	304	331	java/io/EOFException
    //   321	331	331	java/io/EOFException
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
    return (Continuation<Unit>)new Object(this.$outgoingTransformed, this.$outgoing, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-ktor-jvm-0.4.32.jar!\ai\grazie\client\ktor\GrazieKtorWebSocketClient$connect$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */