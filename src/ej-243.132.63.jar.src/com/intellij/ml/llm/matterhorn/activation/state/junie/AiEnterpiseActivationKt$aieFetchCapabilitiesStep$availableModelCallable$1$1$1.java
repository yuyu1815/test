package com.intellij.ml.llm.matterhorn.activation.state.junie;

import com.intellij.ml.llm.activation.data.model.LlmModelId;
import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
import com.intellij.openapi.diagnostic.Logger;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "aiEnterpiseActivation.kt", l = {124, 125}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\016\022\n\022\b\022\004\022\0020\0030\0020\001*\0020\004H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "", "Lcom/intellij/ml/llm/activation/data/model/LlmModelId;", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\naiEnterpiseActivation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 aiEnterpiseActivation.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1\n+ 2 GrazieResultMapper.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieResultMapperKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n41#2,2:185\n43#2:200\n61#3,5:187\n61#3,5:194\n1872#4,2:192\n1874#4:199\n*S KotlinDebug\n*F\n+ 1 aiEnterpiseActivation.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1\n*L\n126#1:185,2\n126#1:200\n127#1:187,5\n129#1:194,5\n128#1:192,2\n128#1:199\n*E\n"})
final class null extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GrazieResult<? extends List<? extends LlmModelId>>>, Object> {
  int label;
  
  null(String $apiUrl, GrazieAuthData $authData, Logger $logger, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #27
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 337, 0 -> 36, 1 -> 64, 2 -> 105
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: getstatic com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository$Companion;
    //   43: aload_0
    //   44: checkcast kotlin/coroutines/Continuation
    //   47: aload_0
    //   48: iconst_1
    //   49: putfield label : I
    //   52: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   55: dup
    //   56: aload #27
    //   58: if_acmpne -> 69
    //   61: aload #27
    //   63: areturn
    //   64: aload_1
    //   65: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   68: aload_1
    //   69: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository
    //   72: astore_2
    //   73: aload_2
    //   74: aload_0
    //   75: getfield $apiUrl : Ljava/lang/String;
    //   78: aload_0
    //   79: getfield $authData : Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
    //   82: aload_0
    //   83: checkcast kotlin/coroutines/Continuation
    //   86: aload_0
    //   87: iconst_2
    //   88: putfield label : I
    //   91: invokeinterface listAvailableModels-1CSWKTE : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   96: dup
    //   97: aload #27
    //   99: if_acmpne -> 110
    //   102: aload #27
    //   104: areturn
    //   105: aload_1
    //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   109: aload_1
    //   110: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
    //   113: astore #4
    //   115: aload_0
    //   116: getfield $logger : Lcom/intellij/openapi/diagnostic/Logger;
    //   119: astore #5
    //   121: iconst_0
    //   122: istore #6
    //   124: aload #4
    //   126: astore #7
    //   128: aload #7
    //   130: astore #8
    //   132: iconst_0
    //   133: istore #9
    //   135: aload #8
    //   137: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
    //   140: ifeq -> 330
    //   143: aload #8
    //   145: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
    //   148: invokevirtual getValue : ()Ljava/lang/Object;
    //   151: checkcast java/util/List
    //   154: astore #10
    //   156: iconst_0
    //   157: istore #11
    //   159: aload #5
    //   161: astore #12
    //   163: aconst_null
    //   164: astore #13
    //   166: iconst_0
    //   167: istore #14
    //   169: aload #12
    //   171: invokevirtual isDebugEnabled : ()Z
    //   174: ifeq -> 204
    //   177: aload #12
    //   179: astore #15
    //   181: iconst_0
    //   182: istore #16
    //   184: aload #10
    //   186: invokeinterface size : ()I
    //   191: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
    //   196: aload #15
    //   198: swap
    //   199: aload #13
    //   201: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   204: nop
    //   205: aload #10
    //   207: checkcast java/lang/Iterable
    //   210: astore #12
    //   212: iconst_0
    //   213: istore #13
    //   215: iconst_0
    //   216: istore #14
    //   218: aload #12
    //   220: invokeinterface iterator : ()Ljava/util/Iterator;
    //   225: astore #16
    //   227: aload #16
    //   229: invokeinterface hasNext : ()Z
    //   234: ifeq -> 328
    //   237: aload #16
    //   239: invokeinterface next : ()Ljava/lang/Object;
    //   244: astore #17
    //   246: iload #14
    //   248: iinc #14, 1
    //   251: istore #18
    //   253: iload #18
    //   255: ifge -> 261
    //   258: invokestatic throwIndexOverflow : ()V
    //   261: iload #18
    //   263: aload #17
    //   265: checkcast com/intellij/ml/llm/activation/data/model/LlmModelId
    //   268: invokevirtual unbox-impl : ()Ljava/lang/String;
    //   271: astore #19
    //   273: istore #20
    //   275: iconst_0
    //   276: istore #21
    //   278: aload #5
    //   280: astore #22
    //   282: aconst_null
    //   283: astore #23
    //   285: iconst_0
    //   286: istore #24
    //   288: aload #22
    //   290: invokevirtual isDebugEnabled : ()Z
    //   293: ifeq -> 323
    //   296: aload #22
    //   298: astore #25
    //   300: iconst_0
    //   301: istore #26
    //   303: iload #20
    //   305: aload #19
    //   307: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
    //   310: <illegal opcode> makeConcatWithConstants : (ILjava/lang/String;)Ljava/lang/String;
    //   315: aload #25
    //   317: swap
    //   318: aload #23
    //   320: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   323: nop
    //   324: nop
    //   325: goto -> 227
    //   328: nop
    //   329: nop
    //   330: nop
    //   331: aload #7
    //   333: nop
    //   334: astore_3
    //   335: aload_3
    //   336: areturn
    //   337: new java/lang/IllegalStateException
    //   340: dup
    //   341: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   343: invokespecial <init> : (Ljava/lang/String;)V
    //   346: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #123	-> 3
    //   #124	-> 40
    //   #123	-> 61
    //   #125	-> 73
    //   #123	-> 102
    //   #126	-> 115
    //   #185	-> 124
    //   #186	-> 135
    //   #127	-> 159
    //   #187	-> 163
    //   #188	-> 169
    //   #189	-> 177
    //   #127	-> 184
    //   #189	-> 199
    //   #191	-> 204
    //   #128	-> 205
    //   #192	-> 215
    //   #193	-> 218
    //   #193	-> 263
    //   #129	-> 278
    //   #194	-> 282
    //   #195	-> 288
    //   #196	-> 296
    //   #129	-> 303
    //   #196	-> 318
    //   #198	-> 323
    //   #130	-> 324
    //   #193	-> 325
    //   #199	-> 328
    //   #131	-> 329
    //   #186	-> 330
    //   #200	-> 330
    //   #185	-> 331
    //   #200	-> 333
    //   #126	-> 334
    //   #125	-> 334
    //   #132	-> 335
    //   #123	-> 337
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   73	23	2	grazie	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
    //   335	2	3	availableModels	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
    //   115	17	4	$this$onSuccess$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
    //   132	24	8	$this$onSuccess_u24lambda_u241$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
    //   156	56	10	models	Ljava/util/List;
    //   163	21	12	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
    //   212	15	12	$this$forEachIndexed$iv	Ljava/lang/Iterable;
    //   166	38	13	e$iv	Ljava/lang/Exception;
    //   218	111	14	index$iv	I
    //   246	29	17	item$iv	Ljava/lang/Object;
    //   275	40	19	next	Ljava/lang/String;
    //   275	40	20	idx	I
    //   282	21	22	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
    //   285	38	23	e$iv	Ljava/lang/Exception;
    //   184	12	16	$i$a$-debug$default-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1$availableModels$1$1	I
    //   169	36	14	$i$f$debug	I
    //   303	12	26	$i$a$-debug$default-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1$availableModels$1$2$1	I
    //   288	36	24	$i$f$debug	I
    //   278	47	21	$i$a$-forEachIndexed-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1$availableModels$1$2	I
    //   215	114	13	$i$f$forEachIndexed	I
    //   159	171	11	$i$a$-onSuccess-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1$availableModels$1	I
    //   135	196	9	$i$a$-apply-GrazieResultMapperKt$onSuccess$1$iv	I
    //   124	210	6	$i$f$onSuccess	I
    //   0	347	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1;
    //   40	297	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
    return (Continuation<Unit>)new Object(this.$apiUrl, this.$authData, this.$logger, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */