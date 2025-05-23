/*     */ package org.jetbrains.jewel.ui.component.styling;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @GenerateDataFunctions
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\006\b\007\030\000 \b2\0020\001:\001\bB\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\t"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/DropdownIcons;", "", "chevronDown", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "<init>", "(Lorg/jetbrains/jewel/ui/icon/IconKey;)V", "getChevronDown", "()Lorg/jetbrains/jewel/ui/icon/IconKey;", "Companion", "ui"})
/*     */ @Immutable
/*     */ public final class DropdownIcons
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final IconKey chevronDown;
/*     */   public static final int $stable;
/*     */   
/*     */   public DropdownIcons(@NotNull IconKey chevronDown) {
/* 123 */     this.chevronDown = chevronDown; } @NotNull public final IconKey getChevronDown() { return this.chevronDown; }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof DropdownIcons))
/*     */       return false; 
/*     */     DropdownIcons dropdownIcons = (DropdownIcons)other;
/*     */     return !!Intrinsics.areEqual(this.chevronDown, dropdownIcons.chevronDown);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return this.chevronDown.hashCode();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "DropdownIcons(chevronDown=" + this.chevronDown + ")";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/DropdownIcons$Companion;", "", "<init>", "()V", "ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\DropdownIcons.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */