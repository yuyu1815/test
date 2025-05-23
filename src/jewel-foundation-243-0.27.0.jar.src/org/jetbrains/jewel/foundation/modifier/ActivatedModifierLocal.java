/*     */ package org.jetbrains.jewel.foundation.modifier;
/*     */ 
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.modifier.ModifierLocal;
/*     */ import androidx.compose.ui.modifier.ModifierLocalConsumer;
/*     */ import androidx.compose.ui.modifier.ModifierLocalProvider;
/*     */ import androidx.compose.ui.modifier.ModifierLocalReadScope;
/*     */ import androidx.compose.ui.modifier.ProvidableModifierLocal;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\020\013\n\002\030\002\n\002\b\017\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\b\002\030\0002\b\022\004\022\0020\0020\0012\0020\003B\007¢\006\004\b\004\020\005J\020\020\022\032\0020\0232\006\020\024\032\0020\025H\026J\006\020\037\032\0020\023J\006\020 \032\0020\023R+\020\007\032\0020\0022\006\020\006\032\0020\0028B@BX\002¢\006\022\n\004\b\f\020\r\032\004\b\b\020\t\"\004\b\n\020\013R+\020\016\032\0020\0022\006\020\006\032\0020\0028B@BX\002¢\006\022\n\004\b\021\020\r\032\004\b\017\020\t\"\004\b\020\020\013R\032\020\026\032\b\022\004\022\0020\0020\027X\004¢\006\b\n\000\032\004\b\030\020\031R\033\020\032\032\0020\0028VX\002¢\006\f\n\004\b\035\020\036\032\004\b\033\020\034¨\006!"}, d2 = {"Lorg/jetbrains/jewel/foundation/modifier/ActivatedModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "<init>", "()V", "<set-?>", "parentActivated", "getParentActivated", "()Z", "setParentActivated", "(Z)V", "parentActivated$delegate", "Landroidx/compose/runtime/MutableState;", "hasFocus", "getHasFocus", "setHasFocus", "hasFocus$delegate", "onModifierLocalsUpdated", "", "scope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "value", "getValue", "()Ljava/lang/Boolean;", "value$delegate", "Landroidx/compose/runtime/State;", "childLostFocus", "childGainedFocus", "foundation"})
/*     */ @SourceDebugExtension({"SMAP\nActivation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activation.kt\norg/jetbrains/jewel/foundation/modifier/ActivatedModifierLocal\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n81#2:164\n107#2,2:165\n81#2:167\n107#2,2:168\n81#2:171\n1#3:170\n*S KotlinDebug\n*F\n+ 1 Activation.kt\norg/jetbrains/jewel/foundation/modifier/ActivatedModifierLocal\n*L\n100#1:164\n100#1:165,2\n102#1:167\n102#1:168,2\n109#1:171\n*E\n"})
/*     */ final class ActivatedModifierLocal
/*     */   implements ModifierLocalProvider<Boolean>, ModifierLocalConsumer
/*     */ {
/*     */   @NotNull
/* 100 */   private final MutableState parentActivated$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(false), null, 2, null); private final boolean getParentActivated() { State state = (State)this.parentActivated$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return (
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
/* 164 */       (Boolean)state.getValue()).booleanValue(); } private final void setParentActivated(boolean <set-?>) { MutableState mutableState = this.parentActivated$delegate; Object object = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 165 */     mutableState.setValue(value$iv); } private final boolean getHasFocus() { State state = (State)this.hasFocus$delegate; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 167 */     return ((Boolean)state.getValue()).booleanValue(); } @NotNull private final MutableState hasFocus$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(false), null, 2, null); private final void setHasFocus(boolean <set-?>) { MutableState mutableState = this.hasFocus$delegate; Object object = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 168 */     mutableState.setValue(value$iv); } public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) { Intrinsics.checkNotNullParameter(scope, "scope");
/*     */     ModifierLocalReadScope $this$onModifierLocalsUpdated_u24lambda_u240 = scope;
/* 170 */     int $i$a$-with-ActivatedModifierLocal$onModifierLocalsUpdated$1 = 0; setParentActivated(((Boolean)$this$onModifierLocalsUpdated_u24lambda_u240.getCurrent((ModifierLocal)ActivationKt.getModifierLocalActivated())).booleanValue()); } @NotNull public Boolean getValue() { State state = this.value$delegate; KProperty property$iv = null; int $i$f$getValue = 0;
/* 171 */     return (Boolean)state.getValue(); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final ProvidableModifierLocal<Boolean> key = ActivationKt.getModifierLocalActivated();
/*     */   
/*     */   @NotNull
/*     */   public ProvidableModifierLocal<Boolean> getKey() {
/*     */     return this.key;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private final State value$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), this::value_delegate$lambda$1);
/*     */   
/*     */   private static final boolean value_delegate$lambda$1(ActivatedModifierLocal this$0) {
/*     */     return (this$0.getParentActivated() && this$0.getHasFocus());
/*     */   }
/*     */   
/*     */   public final void childLostFocus() {
/*     */     setHasFocus(false);
/*     */   }
/*     */   
/*     */   public final void childGainedFocus() {
/*     */     setHasFocus(true);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\modifier\ActivatedModifierLocal.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */