package com.intellij.ml.llm.matterhorn.core.llm.ingrazzio;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@DebugMetadata(f = "IngrazzioAuthService.kt", l = {223}, i = {0}, s = {"L$0"}, n = {"token"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\016\n\000\n\002\030\002\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n"}, d2 = {"<anonymous>", "", "token", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;"})
final class IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1 extends SuspendLambda implements Function2<AccessToken, Continuation<? super String>, Object> {
  int label;
  
  IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1(Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 121, 0 -> 32, 1 -> 83
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield L$0 : Ljava/lang/Object;
    //   40: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
    //   43: astore_2
    //   44: nop
    //   45: aload_2
    //   46: ifnonnull -> 54
    //   49: ldc 'https://lp.jetbrains.com/junie-failed/'
    //   51: goto -> 120
    //   54: aload_0
    //   55: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
    //   58: aload_2
    //   59: aload_0
    //   60: checkcast kotlin/coroutines/Continuation
    //   63: aload_0
    //   64: aload_2
    //   65: putfield L$0 : Ljava/lang/Object;
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield label : I
    //   73: invokevirtual checkIngrazzioAccess : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   76: dup
    //   77: aload_3
    //   78: if_acmpne -> 96
    //   81: aload_3
    //   82: areturn
    //   83: aload_0
    //   84: getfield L$0 : Ljava/lang/Object;
    //   87: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
    //   90: astore_2
    //   91: aload_1
    //   92: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   95: aload_1
    //   96: checkcast java/lang/Boolean
    //   99: invokevirtual booleanValue : ()Z
    //   102: ifeq -> 118
    //   105: aload_0
    //   106: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;
    //   109: aload_2
    //   110: invokestatic access$setAccessTokenInternal : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService;Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;)V
    //   113: ldc 'https://lp.jetbrains.com/junie-success'
    //   115: goto -> 120
    //   118: ldc 'https://lp.jetbrains.com/junie-join-access-waitlist/'
    //   120: areturn
    //   121: new java/lang/IllegalStateException
    //   124: dup
    //   125: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   127: invokespecial <init> : (Ljava/lang/String;)V
    //   130: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #220	-> 3
    //   #221	-> 44
    //   #222	-> 45
    //   #223	-> 54
    //   #220	-> 81
    //   #223	-> 96
    //   #224	-> 105
    //   #225	-> 113
    //   #228	-> 118
    //   #229	-> 120
    //   #220	-> 121
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	39	2	token	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
    //   91	22	2	token	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
    //   0	131	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1;
    //   36	85	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1> $completion) {
    IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1 ingrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1 = new IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1($completion);
    ingrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1.L$0 = value;
    return (Continuation<Unit>)ingrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1;
  }
  
  public final Object invoke(AccessToken p1, Continuation<?> p2) {
    return ((IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\ingrazzio\IngrazzioAuthService$startAndAwaitAuthorizationProcess$deferred$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */