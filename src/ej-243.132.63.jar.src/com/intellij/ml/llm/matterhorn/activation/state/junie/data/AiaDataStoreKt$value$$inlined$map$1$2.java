/*     */ package com.intellij.ml.llm.matterhorn.activation.state.junie.data;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.InlineMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"})
/*     */ @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt\n*L\n1#1,218:1\n50#2:219\n79#3:220\n*E\n"})
/*     */ public final class null<T>
/*     */   implements FlowCollector
/*     */ {
/*     */   public null(FlowCollector $receiver, Function1 paramFunction1) {}
/*     */   
/*     */   @Nullable
/*     */   public final Object emit(Object value, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt$value$$inlined$map$1$2$1
/*     */     //   4: ifeq -> 36
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt$value$$inlined$map$1$2$1
/*     */     //   11: astore_3
/*     */     //   12: aload_3
/*     */     //   13: getfield label : I
/*     */     //   16: ldc -2147483648
/*     */     //   18: iand
/*     */     //   19: ifeq -> 36
/*     */     //   22: aload_3
/*     */     //   23: dup
/*     */     //   24: getfield label : I
/*     */     //   27: ldc -2147483648
/*     */     //   29: isub
/*     */     //   30: putfield label : I
/*     */     //   33: goto -> 46
/*     */     //   36: new com/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt$value$$inlined$map$1$2$1
/*     */     //   39: dup
/*     */     //   40: aload_0
/*     */     //   41: aload_2
/*     */     //   42: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt$value$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V
/*     */     //   45: astore_3
/*     */     //   46: aload_3
/*     */     //   47: getfield result : Ljava/lang/Object;
/*     */     //   50: astore #4
/*     */     //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: aload_3
/*     */     //   58: getfield label : I
/*     */     //   61: tableswitch default -> 166, 0 -> 84, 1 -> 151
/*     */     //   84: aload #4
/*     */     //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   89: aload_0
/*     */     //   90: getfield $this_unsafeFlow : Lkotlinx/coroutines/flow/FlowCollector;
/*     */     //   93: aload_1
/*     */     //   94: astore #6
/*     */     //   96: astore #7
/*     */     //   98: iconst_0
/*     */     //   99: istore #8
/*     */     //   101: aload #7
/*     */     //   103: astore #9
/*     */     //   105: aload #6
/*     */     //   107: aload_3
/*     */     //   108: checkcast kotlin/coroutines/Continuation
/*     */     //   111: pop
/*     */     //   112: astore #10
/*     */     //   114: iconst_0
/*     */     //   115: istore #11
/*     */     //   117: aload_0
/*     */     //   118: getfield $value$inlined : Lkotlin/jvm/functions/Function1;
/*     */     //   121: aload #10
/*     */     //   123: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   128: aload #9
/*     */     //   130: swap
/*     */     //   131: aload_3
/*     */     //   132: aload_3
/*     */     //   133: iconst_1
/*     */     //   134: putfield label : I
/*     */     //   137: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   142: dup
/*     */     //   143: aload #5
/*     */     //   145: if_acmpne -> 161
/*     */     //   148: aload #5
/*     */     //   150: areturn
/*     */     //   151: iconst_0
/*     */     //   152: istore #8
/*     */     //   154: aload #4
/*     */     //   156: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   159: aload #4
/*     */     //   161: pop
/*     */     //   162: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   165: areturn
/*     */     //   166: new java/lang/IllegalStateException
/*     */     //   169: dup
/*     */     //   170: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   172: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   175: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #0	-> 55
/*     */     //   #49	-> 89
/*     */     //   #219	-> 101
/*     */     //   #220	-> 117
/*     */     //   #219	-> 128
/*     */     //   #0	-> 148
/*     */     //   #49	-> 161
/*     */     //   #0	-> 166
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   89	39	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt$value$$inlined$map$1$2;
/*     */     //   89	9	1	value	Ljava/lang/Object;
/*     */     //   98	16	6	value	Ljava/lang/Object;
/*     */     //   98	16	7	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
/*     */     //   114	14	10	it	Ljava/lang/Object;
/*     */     //   117	11	11	$i$a$-map-AiaDataStoreKt$value$1	I
/*     */     //   0	176	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   101	50	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
/*     */     //   46	120	3	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   52	114	4	$result	Ljava/lang/Object;
/*     */     //   154	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object emit$$forInline(Object value, @NotNull Continuation $completion) {
/*  49 */     InlineMarker.mark(4); InlineMarker.mark(5); new ContinuationImpl($completion) { int label; Object L$0; @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return AiaDataStoreKt$value$$inlined$map$1.null.this.emit(null, (Continuation)this); } }; Continuation continuation1 = $completion; Object object1 = value; FlowCollector $this$map_u24lambda_u245 = this.$this_unsafeFlow; int $i$a$-unsafeTransform-FlowKt__TransformKt$map$1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 219 */     FlowCollector flowCollector1 = $this$map_u24lambda_u245; Continuation continuation2 = $completion; Object it = object1; int $i$a$-map-AiaDataStoreKt$value$1 = 0; Object object2 = 
/* 220 */       this.$value$inlined.invoke(it);
/*     */     InlineMarker.mark(0);
/*     */     InlineMarker.mark(1);
/*     */     flowCollector1.emit(object2, $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\AiaDataStoreKt$value$$inlined$map$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */