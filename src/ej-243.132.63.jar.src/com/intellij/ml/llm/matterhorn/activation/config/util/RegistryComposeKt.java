/*    */ package com.intellij.ml.llm.matterhorn.activation.config.util;
/*    */ 
/*    */ import com.intellij.openapi.util.registry.RegistryValue;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\030\002\n\002\020\013\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\032\030\020\000\032\b\022\004\022\0020\0020\001*\0020\0032\006\020\004\032\0020\005\032\030\020\006\032\b\022\004\022\0020\0070\001*\0020\0032\006\020\004\032\0020\005\0324\020\b\032\b\022\004\022\002H\t0\001\"\004\b\000\020\t*\0020\0032\006\020\004\032\0020\0052\022\020\n\032\016\022\004\022\0020\003\022\004\022\002H\t0\013H\000\032\032\020\f\032\b\022\004\022\0020\0030\001*\0020\0032\006\020\004\032\0020\005H\002¨\006\r²\006\n\020\016\032\0020\003X\002"}, d2 = {"asBooleanStateIn", "Landroidx/compose/runtime/State;", "", "Lcom/intellij/openapi/util/registry/RegistryValue;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "asStringStateIn", "", "valueStateIn", "T", "transform", "Lkotlin/Function1;", "stateIn", "config", "value"})
/*    */ @SourceDebugExtension({"SMAP\nregistryCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 registryCompose.kt\ncom/intellij/ml/llm/matterhorn/activation/config/util/RegistryComposeKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,26:1\n81#2:27\n*S KotlinDebug\n*F\n+ 1 registryCompose.kt\ncom/intellij/ml/llm/matterhorn/activation/config/util/RegistryComposeKt\n*L\n13#1:27\n*E\n"})
/*    */ public final class RegistryComposeKt {
/*    */   @NotNull
/*  9 */   public static final State<Boolean> asBooleanStateIn(@NotNull RegistryValue $this$asBooleanStateIn, @NotNull CoroutineScope cs) { Intrinsics.checkNotNullParameter($this$asBooleanStateIn, "<this>"); Intrinsics.checkNotNullParameter(cs, "cs"); return valueStateIn($this$asBooleanStateIn, cs, RegistryComposeKt::asBooleanStateIn$lambda$0); } private static final boolean asBooleanStateIn$lambda$0(RegistryValue it) { Intrinsics.checkNotNullParameter(it, "it"); return it.asBoolean(); } @NotNull
/* 10 */   public static final State<String> asStringStateIn(@NotNull RegistryValue $this$asStringStateIn, @NotNull CoroutineScope cs) { Intrinsics.checkNotNullParameter($this$asStringStateIn, "<this>"); Intrinsics.checkNotNullParameter(cs, "cs"); return valueStateIn($this$asStringStateIn, cs, RegistryComposeKt::asStringStateIn$lambda$1); } private static final String asStringStateIn$lambda$1(RegistryValue it) { Intrinsics.checkNotNullParameter(it, "it"); return it.asString(); }
/*    */   @NotNull
/*    */   public static final <T> State<T> valueStateIn(@NotNull RegistryValue $this$valueStateIn, @NotNull CoroutineScope cs, @NotNull Function1 transform) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc '<this>'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 'cs'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_2
/*    */     //   13: ldc 'transform'
/*    */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: aload_0
/*    */     //   19: aload_1
/*    */     //   20: invokestatic stateIn : (Lcom/intellij/openapi/util/registry/RegistryValue;Lkotlinx/coroutines/CoroutineScope;)Landroidx/compose/runtime/State;
/*    */     //   23: astore_3
/*    */     //   24: aload_2
/*    */     //   25: aload_3
/*    */     //   26: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function0;
/*    */     //   31: invokestatic derivedStateOf : (Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;
/*    */     //   34: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 18
/*    */     //   #14	-> 24
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   24	11	3	value$delegate	Landroidx/compose/runtime/State;
/*    */     //   0	35	0	$this$valueStateIn	Lcom/intellij/openapi/util/registry/RegistryValue;
/*    */     //   0	35	1	cs	Lkotlinx/coroutines/CoroutineScope;
/*    */     //   0	35	2	transform	Lkotlin/jvm/functions/Function1; } private static final RegistryValue valueStateIn$lambda$2(State $value$delegate) {
/* 13 */     State state = $value$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
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
/* 27 */       (RegistryValue)state.getValue();
/*    */   }
/*    */   
/*    */   private static final Object valueStateIn$lambda$3(Function1 $transform, State<? extends RegistryValue> $value$delegate) {
/*    */     return $transform.invoke(valueStateIn$lambda$2($value$delegate));
/*    */   }
/*    */   
/*    */   private static final State<RegistryValue> stateIn(RegistryValue $this$stateIn, CoroutineScope cs) {
/*    */     MutableState<RegistryValue> mutableState = SnapshotStateKt.mutableStateOf($this$stateIn, SnapshotStateKt.neverEqualPolicy());
/*    */     $this$stateIn.addListener(new RegistryComposeKt$stateIn$1(mutableState), cs);
/*    */     return (State<RegistryValue>)mutableState;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/activation/config/util/RegistryComposeKt$stateIn$1", "Lcom/intellij/openapi/util/registry/RegistryValueListener;", "afterValueChanged", "", "value", "Lcom/intellij/openapi/util/registry/RegistryValue;", "config"})
/*    */   public static final class RegistryComposeKt$stateIn$1 implements RegistryValueListener {
/*    */     RegistryComposeKt$stateIn$1(MutableState<RegistryValue> $mutableState) {}
/*    */     
/*    */     public void afterValueChanged(RegistryValue value) {
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       this.$mutableState.setValue(value);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\confi\\util\RegistryComposeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */