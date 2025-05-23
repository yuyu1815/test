/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\016\020\b\032\0020\tH@¢\006\002\020\nJ\020\020\013\032\004\030\0010\fH@¢\006\002\020\nR\021\020\004\032\0020\0058F¢\006\006\032\004\b\006\020\007¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;", "Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieAuthService;", "<init>", "()V", "authFacade", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;", "getAuthFacade", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;", "reloginAndWait", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClient", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class JunieGrazieAuthService implements GrazieAuthService {
/*    */   @NotNull
/*    */   public final GrazieAuthFacade getAuthFacade() {
/* 11 */     return GrazieAuthFacade.Companion.getInstance();
/*    */   }
/*    */   
/*    */   public static final int $stable;
/*    */   
/*    */   @Nullable
/*    */   public Object reloginAndWait(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService$reloginAndWait$1
/*    */     //   4: ifeq -> 36
/*    */     //   7: aload_1
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService$reloginAndWait$1
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
/*    */     //   33: goto -> 46
/*    */     //   36: new com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService$reloginAndWait$1
/*    */     //   39: dup
/*    */     //   40: aload_0
/*    */     //   41: aload_1
/*    */     //   42: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;Lkotlin/coroutines/Continuation;)V
/*    */     //   45: astore_3
/*    */     //   46: aload_3
/*    */     //   47: getfield result : Ljava/lang/Object;
/*    */     //   50: astore_2
/*    */     //   51: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   54: astore #4
/*    */     //   56: aload_3
/*    */     //   57: getfield label : I
/*    */     //   60: tableswitch default -> 176, 0 -> 88, 1 -> 125, 2 -> 166
/*    */     //   88: aload_2
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: aload_0
/*    */     //   93: invokevirtual getAuthFacade : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;
/*    */     //   96: invokevirtual relogin : ()V
/*    */     //   99: ldc2_w 10
/*    */     //   102: aload_3
/*    */     //   103: aload_3
/*    */     //   104: aload_0
/*    */     //   105: putfield L$0 : Ljava/lang/Object;
/*    */     //   108: aload_3
/*    */     //   109: iconst_1
/*    */     //   110: putfield label : I
/*    */     //   113: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   116: dup
/*    */     //   117: aload #4
/*    */     //   119: if_acmpne -> 138
/*    */     //   122: aload #4
/*    */     //   124: areturn
/*    */     //   125: aload_3
/*    */     //   126: getfield L$0 : Ljava/lang/Object;
/*    */     //   129: checkcast com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService
/*    */     //   132: astore_0
/*    */     //   133: aload_2
/*    */     //   134: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   137: aload_2
/*    */     //   138: pop
/*    */     //   139: aload_0
/*    */     //   140: invokevirtual getAuthFacade : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;
/*    */     //   143: aload_3
/*    */     //   144: aload_3
/*    */     //   145: aconst_null
/*    */     //   146: putfield L$0 : Ljava/lang/Object;
/*    */     //   149: aload_3
/*    */     //   150: iconst_2
/*    */     //   151: putfield label : I
/*    */     //   154: invokevirtual getOrWaitGrazieAuthContext : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   157: dup
/*    */     //   158: aload #4
/*    */     //   160: if_acmpne -> 171
/*    */     //   163: aload #4
/*    */     //   165: areturn
/*    */     //   166: aload_2
/*    */     //   167: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   170: aload_2
/*    */     //   171: pop
/*    */     //   172: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   175: areturn
/*    */     //   176: new java/lang/IllegalStateException
/*    */     //   179: dup
/*    */     //   180: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   182: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   185: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 54
/*    */     //   #14	-> 92
/*    */     //   #16	-> 99
/*    */     //   #13	-> 122
/*    */     //   #17	-> 138
/*    */     //   #13	-> 163
/*    */     //   #18	-> 171
/*    */     //   #13	-> 176
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;
/*    */     //   133	24	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;
/*    */     //   0	186	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   46	130	3	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   51	125	2	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object getClient(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService$getClient$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService$getClient$1
/*    */     //   11: astore #4
/*    */     //   13: aload #4
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #4
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService$getClient$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 195, 0 -> 92, 1 -> 120, 2 -> 164
/*    */     //   92: aload_3
/*    */     //   93: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   96: aload_0
/*    */     //   97: invokevirtual getAuthFacade : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;
/*    */     //   100: aload #4
/*    */     //   102: aload #4
/*    */     //   104: iconst_1
/*    */     //   105: putfield label : I
/*    */     //   108: invokevirtual getOrWaitGrazieAuthContext : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   111: dup
/*    */     //   112: aload #5
/*    */     //   114: if_acmpne -> 125
/*    */     //   117: aload #5
/*    */     //   119: areturn
/*    */     //   120: aload_3
/*    */     //   121: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   124: aload_3
/*    */     //   125: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext
/*    */     //   128: astore_2
/*    */     //   129: aload_2
/*    */     //   130: ifnonnull -> 135
/*    */     //   133: aconst_null
/*    */     //   134: areturn
/*    */     //   135: getstatic com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider$Companion;
/*    */     //   138: aload #4
/*    */     //   140: aload #4
/*    */     //   142: aload_2
/*    */     //   143: putfield L$0 : Ljava/lang/Object;
/*    */     //   146: aload #4
/*    */     //   148: iconst_2
/*    */     //   149: putfield label : I
/*    */     //   152: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   155: dup
/*    */     //   156: aload #5
/*    */     //   158: if_acmpne -> 178
/*    */     //   161: aload #5
/*    */     //   163: areturn
/*    */     //   164: aload #4
/*    */     //   166: getfield L$0 : Ljava/lang/Object;
/*    */     //   169: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext
/*    */     //   172: astore_2
/*    */     //   173: aload_3
/*    */     //   174: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   177: aload_3
/*    */     //   178: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider
/*    */     //   181: aload_2
/*    */     //   182: invokevirtual getApiUrl-vI_bMBc : ()Ljava/lang/String;
/*    */     //   185: aload_2
/*    */     //   186: invokevirtual getAuthData : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*    */     //   189: invokeinterface authorizedApiClient-62T2iwg : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;)Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*    */     //   194: areturn
/*    */     //   195: new java/lang/IllegalStateException
/*    */     //   198: dup
/*    */     //   199: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   201: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   204: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 59
/*    */     //   #21	-> 96
/*    */     //   #20	-> 117
/*    */     //   #22	-> 129
/*    */     //   #23	-> 133
/*    */     //   #26	-> 135
/*    */     //   #20	-> 161
/*    */     //   #27	-> 181
/*    */     //   #28	-> 185
/*    */     //   #26	-> 189
/*    */     //   #20	-> 195
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   96	15	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;
/*    */     //   129	35	2	authContext	Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext;
/*    */     //   173	22	2	authContext	Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext;
/*    */     //   0	205	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	145	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	139	3	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieGrazieAuthService.kt", l = {21, 26}, i = {1}, s = {"L$0"}, n = {"authContext"}, m = "getClient", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieGrazieAuthService")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieGrazieAuthService$getClient$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     JunieGrazieAuthService$getClient$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieGrazieAuthService.this.getClient((Continuation<? super SuspendableAPIGatewayClient>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieGrazieAuthService.kt", l = {16, 17}, i = {0}, s = {"L$0"}, n = {"this"}, m = "reloginAndWait", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieGrazieAuthService")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieGrazieAuthService$reloginAndWait$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     JunieGrazieAuthService$reloginAndWait$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieGrazieAuthService.this.reloginAndWait((Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\JunieGrazieAuthService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */