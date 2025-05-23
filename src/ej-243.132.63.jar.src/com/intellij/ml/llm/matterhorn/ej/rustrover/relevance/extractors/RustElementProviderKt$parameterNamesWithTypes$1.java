package com.intellij.ml.llm.matterhorn.ej.rustrover.relevance.extractors;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;
import org.rust.lang.core.psi.RsFunction;
import org.rust.lang.core.psi.RsTypeReference;

@DebugMetadata(f = "RustElementProvider.kt", l = {148, 149}, i = {0}, s = {"L$0"}, n = {"$this$sequence"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.relevance.extractors.RustElementProviderKt$parameterNamesWithTypes$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\030\002\020\000\032\0020\001*\030\022\024\022\022\022\006\022\004\030\0010\004\022\006\022\004\030\0010\0050\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lkotlin/Pair;", "", "Lorg/rust/lang/core/psi/RsTypeReference;"})
@SourceDebugExtension({"SMAP\nRustElementProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RustElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/rustrover/relevance/extractors/RustElementProviderKt$parameterNamesWithTypes$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n1#2:157\n1557#3:158\n1628#3,3:159\n*S KotlinDebug\n*F\n+ 1 RustElementProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/rustrover/relevance/extractors/RustElementProviderKt$parameterNamesWithTypes$1\n*L\n149#1:158\n149#1:159,3\n*E\n"})
final class RustElementProviderKt$parameterNamesWithTypes$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Pair<? extends String, ? extends RsTypeReference>>, Continuation<? super Unit>, Object> {
  int label;
  
  RustElementProviderKt$parameterNamesWithTypes$1(RsFunction $element, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #14
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 284, 0 -> 36, 1 -> 103, 2 -> 274
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield L$0 : Ljava/lang/Object;
    //   44: checkcast kotlin/sequences/SequenceScope
    //   47: astore_2
    //   48: aload_0
    //   49: getfield $element : Lorg/rust/lang/core/psi/RsFunction;
    //   52: invokestatic getSelfParameter : (Lorg/rust/lang/core/psi/RsFunction;)Lorg/rust/lang/core/psi/RsSelfParameter;
    //   55: dup
    //   56: ifnull -> 124
    //   59: astore #5
    //   61: iconst_0
    //   62: istore #6
    //   64: aload_2
    //   65: aload #5
    //   67: invokestatic access$getTextAsParamName : (Lorg/rust/lang/core/psi/RsSelfParameter;)Ljava/lang/String;
    //   70: aload #5
    //   72: invokeinterface getTypeReference : ()Lorg/rust/lang/core/psi/RsTypeReference;
    //   77: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    //   80: aload_0
    //   81: aload_0
    //   82: aload_2
    //   83: putfield L$0 : Ljava/lang/Object;
    //   86: aload_0
    //   87: iconst_1
    //   88: putfield label : I
    //   91: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   94: dup
    //   95: aload #14
    //   97: if_acmpne -> 119
    //   100: aload #14
    //   102: areturn
    //   103: iconst_0
    //   104: istore #6
    //   106: aload_0
    //   107: getfield L$0 : Ljava/lang/Object;
    //   110: checkcast kotlin/sequences/SequenceScope
    //   113: astore_2
    //   114: aload_1
    //   115: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   118: aload_1
    //   119: pop
    //   120: nop
    //   121: goto -> 126
    //   124: pop
    //   125: nop
    //   126: aload_2
    //   127: aload_0
    //   128: getfield $element : Lorg/rust/lang/core/psi/RsFunction;
    //   131: invokestatic getRawValueParameters : (Lorg/rust/lang/core/psi/RsFunction;)Ljava/util/List;
    //   134: checkcast java/lang/Iterable
    //   137: astore_3
    //   138: astore #12
    //   140: iconst_0
    //   141: istore #4
    //   143: aload_3
    //   144: astore #5
    //   146: new java/util/ArrayList
    //   149: dup
    //   150: aload_3
    //   151: bipush #10
    //   153: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   156: invokespecial <init> : (I)V
    //   159: checkcast java/util/Collection
    //   162: astore #6
    //   164: iconst_0
    //   165: istore #7
    //   167: aload #5
    //   169: invokeinterface iterator : ()Ljava/util/Iterator;
    //   174: astore #8
    //   176: aload #8
    //   178: invokeinterface hasNext : ()Z
    //   183: ifeq -> 236
    //   186: aload #8
    //   188: invokeinterface next : ()Ljava/lang/Object;
    //   193: astore #9
    //   195: aload #6
    //   197: aload #9
    //   199: checkcast org/rust/lang/core/psi/RsValueParameter
    //   202: astore #10
    //   204: astore #13
    //   206: iconst_0
    //   207: istore #11
    //   209: aload #10
    //   211: invokestatic getPatText : (Lorg/rust/lang/core/psi/RsValueParameter;)Ljava/lang/String;
    //   214: aload #10
    //   216: invokeinterface getTypeReference : ()Lorg/rust/lang/core/psi/RsTypeReference;
    //   221: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    //   224: aload #13
    //   226: swap
    //   227: invokeinterface add : (Ljava/lang/Object;)Z
    //   232: pop
    //   233: goto -> 176
    //   236: aload #6
    //   238: checkcast java/util/List
    //   241: nop
    //   242: aload #12
    //   244: swap
    //   245: checkcast java/lang/Iterable
    //   248: aload_0
    //   249: checkcast kotlin/coroutines/Continuation
    //   252: aload_0
    //   253: aconst_null
    //   254: putfield L$0 : Ljava/lang/Object;
    //   257: aload_0
    //   258: iconst_2
    //   259: putfield label : I
    //   262: invokevirtual yieldAll : (Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   265: dup
    //   266: aload #14
    //   268: if_acmpne -> 279
    //   271: aload #14
    //   273: areturn
    //   274: aload_1
    //   275: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   278: aload_1
    //   279: pop
    //   280: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   283: areturn
    //   284: new java/lang/IllegalStateException
    //   287: dup
    //   288: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   290: invokespecial <init> : (Ljava/lang/String;)V
    //   293: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #147	-> 3
    //   #148	-> 48
    //   #157	-> 61
    //   #148	-> 64
    //   #147	-> 100
    //   #148	-> 119
    //   #148	-> 120
    //   #148	-> 124
    //   #149	-> 126
    //   #158	-> 143
    //   #159	-> 167
    //   #160	-> 195
    //   #149	-> 209
    //   #160	-> 227
    //   #161	-> 236
    //   #158	-> 241
    //   #149	-> 252
    //   #147	-> 271
    //   #150	-> 279
    //   #147	-> 284
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   48	55	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   114	6	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   120	1	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   121	19	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   140	24	3	$this$map$iv	Ljava/lang/Iterable;
    //   61	33	5	it	Lorg/rust/lang/core/psi/RsSelfParameter;
    //   164	12	5	$this$mapTo$iv$iv	Ljava/lang/Iterable;
    //   164	74	6	destination$iv$iv	Ljava/util/Collection;
    //   195	38	9	item$iv$iv	Ljava/lang/Object;
    //   206	18	10	it	Lorg/rust/lang/core/psi/RsValueParameter;
    //   64	39	6	$i$a$-let-RustElementProviderKt$parameterNamesWithTypes$1$1	I
    //   209	15	11	$i$a$-map-RustElementProviderKt$parameterNamesWithTypes$1$2	I
    //   167	71	7	$i$f$mapTo	I
    //   143	99	4	$i$f$map	I
    //   0	294	0	this	Lcom/intellij/ml/llm/matterhorn/ej/rustrover/relevance/extractors/RustElementProviderKt$parameterNamesWithTypes$1;
    //   40	244	1	$result	Ljava/lang/Object;
    //   106	14	6	$i$a$-let-RustElementProviderKt$parameterNamesWithTypes$1$1	I
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super RustElementProviderKt$parameterNamesWithTypes$1> $completion) {
    RustElementProviderKt$parameterNamesWithTypes$1 rustElementProviderKt$parameterNamesWithTypes$1 = new RustElementProviderKt$parameterNamesWithTypes$1(this.$element, $completion);
    rustElementProviderKt$parameterNamesWithTypes$1.L$0 = value;
    return (Continuation<Unit>)rustElementProviderKt$parameterNamesWithTypes$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((RustElementProviderKt$parameterNamesWithTypes$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rustrover\relevance\extractors\RustElementProviderKt$parameterNamesWithTypes$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */