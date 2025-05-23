package com.intellij.ml.llm.matterhorn.activation.data.repos;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 JunieJbaUserRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n50#2:219\n50#3,2:220\n52#3:223\n1#4:222\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(JunieJbaUserRepositoryImpl paramJunieJbaUserRepositoryImpl) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$special$$inlined$map$1$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$special$$inlined$map$1$2$1
    //   11: astore_3
    //   12: aload_3
    //   13: getfield label : I
    //   16: ldc -2147483648
    //   18: iand
    //   19: ifeq -> 36
    //   22: aload_3
    //   23: dup
    //   24: getfield label : I
    //   27: ldc -2147483648
    //   29: isub
    //   30: putfield label : I
    //   33: goto -> 46
    //   36: new com/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$special$$inlined$map$1$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$special$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 235, 0 -> 84, 1 -> 220
    //   84: aload #4
    //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   89: aload_0
    //   90: getfield $this_unsafeFlow : Lkotlinx/coroutines/flow/FlowCollector;
    //   93: aload_1
    //   94: astore #6
    //   96: astore #7
    //   98: iconst_0
    //   99: istore #8
    //   101: aload #7
    //   103: astore #9
    //   105: aload #6
    //   107: aload_3
    //   108: checkcast kotlin/coroutines/Continuation
    //   111: pop
    //   112: checkcast com/intellij/ui/JBAccountInfoService$JBAData
    //   115: astore #10
    //   117: iconst_0
    //   118: istore #11
    //   120: aload #10
    //   122: dup
    //   123: ifnull -> 194
    //   126: pop
    //   127: iconst_0
    //   128: istore #12
    //   130: aload #10
    //   132: invokestatic toJbaUser : (Lcom/intellij/ui/JBAccountInfoService$JBAData;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;
    //   135: aload_0
    //   136: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl;
    //   139: invokestatic access$getJbaInfoService : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl;)Lcom/intellij/ui/JBAccountInfoService;
    //   142: invokeinterface getIdToken : ()Ljava/lang/String;
    //   147: dup
    //   148: ifnull -> 169
    //   151: astore #13
    //   153: astore #14
    //   155: iconst_0
    //   156: istore #15
    //   158: aload #13
    //   160: invokestatic constructor-impl : (Ljava/lang/String;)Ljava/lang/String;
    //   163: aload #14
    //   165: swap
    //   166: goto -> 171
    //   169: pop
    //   170: aconst_null
    //   171: aconst_null
    //   172: astore #16
    //   174: astore #17
    //   176: astore #18
    //   178: new com/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData
    //   181: dup
    //   182: aload #18
    //   184: aload #17
    //   186: aload #16
    //   188: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   191: goto -> 196
    //   194: pop
    //   195: aconst_null
    //   196: nop
    //   197: aload #9
    //   199: swap
    //   200: aload_3
    //   201: aload_3
    //   202: iconst_1
    //   203: putfield label : I
    //   206: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   211: dup
    //   212: aload #5
    //   214: if_acmpne -> 230
    //   217: aload #5
    //   219: areturn
    //   220: iconst_0
    //   221: istore #8
    //   223: aload #4
    //   225: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   228: aload #4
    //   230: pop
    //   231: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   234: areturn
    //   235: new java/lang/IllegalStateException
    //   238: dup
    //   239: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   241: invokespecial <init> : (Ljava/lang/String;)V
    //   244: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 89
    //   #219	-> 101
    //   #220	-> 120
    //   #221	-> 130
    //   #222	-> 153
    //   #221	-> 158
    //   #221	-> 166
    //   #221	-> 169
    //   #220	-> 191
    //   #220	-> 194
    //   #223	-> 196
    //   #219	-> 197
    //   #0	-> 217
    //   #49	-> 230
    //   #0	-> 235
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	64	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryImpl$special$$inlined$map$1$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	19	6	value	Ljava/lang/Object;
    //   98	19	7	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
    //   117	36	10	jbaData	Lcom/intellij/ui/JBAccountInfoService$JBAData;
    //   153	10	13	it	Ljava/lang/String;
    //   158	5	15	$i$a$-let-JunieJbaUserRepositoryImpl$authDataFlow$2$1$1	I
    //   130	61	12	$i$a$-let-JunieJbaUserRepositoryImpl$authDataFlow$2$1	I
    //   120	77	11	$i$a$-map-JunieJbaUserRepositoryImpl$authDataFlow$2	I
    //   0	245	2	$completion	Lkotlin/coroutines/Continuation;
    //   101	119	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	189	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	183	4	$result	Ljava/lang/Object;
    //   223	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieJbaUserRepositoryImpl$special$$inlined$map$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */