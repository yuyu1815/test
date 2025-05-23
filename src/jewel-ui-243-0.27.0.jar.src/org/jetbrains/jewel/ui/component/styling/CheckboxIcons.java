/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
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
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\006\b\007\030\000 \b2\0020\001:\001\bB\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\t"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;", "", "checkbox", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "<init>", "(Lorg/jetbrains/jewel/ui/icon/IconKey;)V", "getCheckbox", "()Lorg/jetbrains/jewel/ui/icon/IconKey;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class CheckboxIcons
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final IconKey checkbox;
/*    */   public static final int $stable;
/*    */   
/*    */   public CheckboxIcons(@NotNull IconKey checkbox) {
/* 89 */     this.checkbox = checkbox; } @NotNull public final IconKey getCheckbox() { return this.checkbox; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CheckboxIcons))
/*    */       return false; 
/*    */     CheckboxIcons checkboxIcons = (CheckboxIcons)other;
/*    */     return !!Intrinsics.areEqual(this.checkbox, checkboxIcons.checkbox);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.checkbox.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CheckboxIcons(checkbox=" + this.checkbox + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\CheckboxIcons.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */