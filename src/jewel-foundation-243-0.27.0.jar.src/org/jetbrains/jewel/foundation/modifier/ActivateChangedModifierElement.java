/*     */ package org.jetbrains.jewel.foundation.modifier;
/*     */ 
/*     */ import androidx.compose.ui.modifier.ModifierLocal;
/*     */ import androidx.compose.ui.modifier.ModifierLocalConsumer;
/*     */ import androidx.compose.ui.modifier.ModifierLocalReadScope;
/*     */ import androidx.compose.ui.platform.InspectorValueInfo;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\000\b\002\030\0002\0020\0012\0020\002B4\022\022\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\004\022\027\020\007\032\023\022\004\022\0020\b\022\004\022\0020\0060\004¢\006\002\b\t¢\006\004\b\n\020\013J\023\020\f\032\0020\0052\b\020\r\032\004\030\0010\016H\002J\b\020\017\032\0020\020H\026J\020\020\022\032\0020\0062\006\020\023\032\0020\024H\026R\032\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\004X\004¢\006\002\n\000R\016\020\021\032\0020\005X\016¢\006\002\n\000¨\006\025"}, d2 = {"Lorg/jetbrains/jewel/foundation/modifier/ActivateChangedModifierElement;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "onChanged", "Lkotlin/Function1;", "", "", "inspectorInfo", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "equals", "other", "", "hashCode", "", "currentActivated", "onModifierLocalsUpdated", "scope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "foundation"})
/*     */ final class ActivateChangedModifierElement
/*     */   extends InspectorValueInfo
/*     */   implements ModifierLocalConsumer
/*     */ {
/*     */   @NotNull
/*     */   private final Function1<Boolean, Unit> onChanged;
/*     */   private boolean currentActivated;
/*     */   
/*     */   public ActivateChangedModifierElement(@NotNull Function1<Boolean, Unit> onChanged, @NotNull Function1 inspectorInfo) {
/* 139 */     super(inspectorInfo);
/*     */     this.onChanged = onChanged; } public boolean equals(@Nullable Object other) {
/* 141 */     if (this == other) return true; 
/* 142 */     if (!(other instanceof ActivateChangedModifierElement)) return false;
/*     */     
/* 144 */     if (!Intrinsics.areEqual(this.onChanged, ((ActivateChangedModifierElement)other).onChanged)) return false;
/*     */     
/* 146 */     return true;
/*     */   }
/*     */   public int hashCode() {
/* 149 */     return this.onChanged.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
/* 154 */     Intrinsics.checkNotNullParameter(scope, "scope"); ModifierLocalReadScope $this$onModifierLocalsUpdated_u24lambda_u240 = scope; int $i$a$-with-ActivateChangedModifierElement$onModifierLocalsUpdated$1 = 0;
/* 155 */     boolean activated = ((Boolean)$this$onModifierLocalsUpdated_u24lambda_u240.getCurrent((ModifierLocal)ActivationKt.getModifierLocalActivated())).booleanValue();
/* 156 */     if (activated != this.currentActivated) {
/* 157 */       this.currentActivated = activated;
/* 158 */       this.onChanged.invoke(Boolean.valueOf(activated));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\modifier\ActivateChangedModifierElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */