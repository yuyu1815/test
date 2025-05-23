/*    */ package ai.grazie.client.common.websocket;
/*    */ 
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.client.common.util.DebugHeaders;
/*    */ import ai.grazie.debug.DebugData;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\001¢\006\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\005H@¢\006\002\020\007JB\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\006\032\0020\0052\"\020\f\032\036\b\001\022\004\022\0020\016\022\n\022\b\022\004\022\0020\t0\017\022\006\022\004\030\0010\0200\rH@¢\006\002\020\021R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/client/common/websocket/SuspendableWebSocketClient$WithDebug;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient;", "client", "(Lai/grazie/client/common/websocket/SuspendableWebSocketClient;)V", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "(Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect", "", "url", "", "body", "Lkotlin/Function2;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */ public final class WithDebug
/*    */   implements SuspendableWebSocketClient
/*    */ {
/*    */   @NotNull
/*    */   private final SuspendableWebSocketClient client;
/*    */   
/*    */   public WithDebug(@NotNull SuspendableWebSocketClient client) {
/* 37 */     this.client = client;
/*    */   } private final Object appendHeaders(RequestOptions options, Continuation $completion) {
/* 39 */     (DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key); boolean requestDebugInfo = ((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key) != null) ? ((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key)).getProvideDebugInfo() : false;
/* 40 */     return DebugHeaders.INSTANCE.append(requestDebugInfo, options);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object connect(@NotNull String url, @NotNull RequestOptions options, @NotNull Function2 body, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/client/common/websocket/SuspendableWebSocketClient$WithDebug$connect$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$WithDebug$connect$1
/*    */     //   13: astore #9
/*    */     //   15: aload #9
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #9
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/client/common/websocket/SuspendableWebSocketClient$WithDebug$connect$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/client/common/websocket/SuspendableWebSocketClient$WithDebug;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #9
/*    */     //   53: aload #9
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #8
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #10
/*    */     //   65: aload #9
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 252, 0 -> 96, 1 -> 152, 2 -> 240
/*    */     //   96: aload #8
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: aload_0
/*    */     //   102: getfield client : Lai/grazie/client/common/websocket/SuspendableWebSocketClient;
/*    */     //   105: aload_1
/*    */     //   106: astore #6
/*    */     //   108: astore #5
/*    */     //   110: aload_0
/*    */     //   111: aload_2
/*    */     //   112: aload #9
/*    */     //   114: aload #9
/*    */     //   116: aload_3
/*    */     //   117: putfield L$0 : Ljava/lang/Object;
/*    */     //   120: aload #9
/*    */     //   122: aload #5
/*    */     //   124: putfield L$1 : Ljava/lang/Object;
/*    */     //   127: aload #9
/*    */     //   129: aload #6
/*    */     //   131: putfield L$2 : Ljava/lang/Object;
/*    */     //   134: aload #9
/*    */     //   136: iconst_1
/*    */     //   137: putfield label : I
/*    */     //   140: invokespecial appendHeaders : (Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   143: dup
/*    */     //   144: aload #10
/*    */     //   146: if_acmpne -> 188
/*    */     //   149: aload #10
/*    */     //   151: areturn
/*    */     //   152: aload #9
/*    */     //   154: getfield L$2 : Ljava/lang/Object;
/*    */     //   157: checkcast java/lang/String
/*    */     //   160: astore #6
/*    */     //   162: aload #9
/*    */     //   164: getfield L$1 : Ljava/lang/Object;
/*    */     //   167: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient
/*    */     //   170: astore #5
/*    */     //   172: aload #9
/*    */     //   174: getfield L$0 : Ljava/lang/Object;
/*    */     //   177: checkcast kotlin/jvm/functions/Function2
/*    */     //   180: astore_3
/*    */     //   181: aload #8
/*    */     //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   186: aload #8
/*    */     //   188: astore #7
/*    */     //   190: aload #5
/*    */     //   192: aload #6
/*    */     //   194: aload #7
/*    */     //   196: checkcast ai/grazie/client/common/model/RequestOptions
/*    */     //   199: aload_3
/*    */     //   200: aload #9
/*    */     //   202: aload #9
/*    */     //   204: aconst_null
/*    */     //   205: putfield L$0 : Ljava/lang/Object;
/*    */     //   208: aload #9
/*    */     //   210: aconst_null
/*    */     //   211: putfield L$1 : Ljava/lang/Object;
/*    */     //   214: aload #9
/*    */     //   216: aconst_null
/*    */     //   217: putfield L$2 : Ljava/lang/Object;
/*    */     //   220: aload #9
/*    */     //   222: iconst_2
/*    */     //   223: putfield label : I
/*    */     //   226: invokeinterface connect : (Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   231: dup
/*    */     //   232: aload #10
/*    */     //   234: if_acmpne -> 247
/*    */     //   237: aload #10
/*    */     //   239: areturn
/*    */     //   240: aload #8
/*    */     //   242: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   245: aload #8
/*    */     //   247: pop
/*    */     //   248: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   251: areturn
/*    */     //   252: new java/lang/IllegalStateException
/*    */     //   255: dup
/*    */     //   256: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   258: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   261: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #43	-> 63
/*    */     //   #44	-> 101
/*    */     //   #43	-> 149
/*    */     //   #44	-> 188
/*    */     //   #43	-> 237
/*    */     //   #44	-> 247
/*    */     //   #43	-> 252
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	42	0	this	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$WithDebug;
/*    */     //   101	42	1	url	Ljava/lang/String;
/*    */     //   101	42	2	options	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   101	51	3	body	Lkotlin/jvm/functions/Function2;
/*    */     //   181	50	3	body	Lkotlin/jvm/functions/Function2;
/*    */     //   0	262	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	199	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	192	8	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SuspendableWebSocketClient.kt", l = {44, 44}, i = {0}, s = {"L$0"}, n = {"body"}, m = "connect", c = "ai.grazie.client.common.websocket.SuspendableWebSocketClient$WithDebug")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SuspendableWebSocketClient$WithDebug$connect$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     SuspendableWebSocketClient$WithDebug$connect$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SuspendableWebSocketClient.WithDebug.this.connect(null, null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\websocket\SuspendableWebSocketClient$WithDebug.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */