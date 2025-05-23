/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.runtime.ProduceStateScope;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ @DebugMetadata(f = "JunieFilePicker.kt", l = {108}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.components.JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\020\013\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""})
/*     */ final class JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1
/*     */   extends SuspendLambda
/*     */   implements Function2<ProduceStateScope<Boolean>, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1(Function1<Continuation<? super Boolean>, Object> $hasAIIgnoreFile, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     ProduceStateScope $this$produceState, produceStateScope1;
/* 107 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$produceState = (ProduceStateScope)this.L$0;
/* 108 */         this.L$0 = produceStateScope1 = $this$produceState; this.label = 1; if (this.$hasAIIgnoreFile.invoke(this) == object) return object;  produceStateScope1.setValue(this.$hasAIIgnoreFile.invoke(this));
/* 109 */         return Unit.INSTANCE;case 1: produceStateScope1 = (ProduceStateScope)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); produceStateScope1.setValue(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1> $completion) {
/*     */     JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1 junieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1 = new JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1(this.$hasAIIgnoreFile, $completion);
/*     */     junieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1.L$0 = value;
/*     */     return (Continuation<Unit>)junieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(ProduceStateScope p1, Continuation<?> p2) {
/*     */     return ((JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieFilePickerKt$JunieFilePickerDialog$2$hasIgnoreFile$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */