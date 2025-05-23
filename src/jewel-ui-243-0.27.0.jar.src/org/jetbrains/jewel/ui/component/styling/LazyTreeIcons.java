/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
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
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\b\007\030\000 \0232\0020\001:\001\023B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\004\b\007\020\bJ\035\020\016\032\0020\0032\006\020\017\032\0020\0202\006\020\021\032\0020\020H\007¢\006\002\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\f\020\nR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\r\020\n¨\006\024"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/LazyTreeIcons;", "", "chevronCollapsed", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "chevronExpanded", "chevronSelectedCollapsed", "chevronSelectedExpanded", "<init>", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Lorg/jetbrains/jewel/ui/icon/IconKey;Lorg/jetbrains/jewel/ui/icon/IconKey;Lorg/jetbrains/jewel/ui/icon/IconKey;)V", "getChevronCollapsed", "()Lorg/jetbrains/jewel/ui/icon/IconKey;", "getChevronExpanded", "getChevronSelectedCollapsed", "getChevronSelectedExpanded", "chevron", "isExpanded", "", "isSelected", "(ZZLandroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/icon/IconKey;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class LazyTreeIcons
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final IconKey chevronCollapsed;
/*    */   @NotNull
/*    */   private final IconKey chevronExpanded;
/*    */   @NotNull
/*    */   private final IconKey chevronSelectedCollapsed;
/*    */   @NotNull
/*    */   private final IconKey chevronSelectedExpanded;
/*    */   public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public final IconKey getChevronCollapsed() {
/*    */     return this.chevronCollapsed;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IconKey getChevronExpanded() {
/*    */     return this.chevronExpanded;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IconKey getChevronSelectedCollapsed() {
/*    */     return this.chevronSelectedCollapsed;
/*    */   }
/*    */   
/*    */   public LazyTreeIcons(@NotNull IconKey chevronCollapsed, @NotNull IconKey chevronExpanded, @NotNull IconKey chevronSelectedCollapsed, @NotNull IconKey chevronSelectedExpanded) {
/* 52 */     this.chevronCollapsed = chevronCollapsed;
/* 53 */     this.chevronExpanded = chevronExpanded;
/* 54 */     this.chevronSelectedCollapsed = chevronSelectedCollapsed;
/* 55 */     this.chevronSelectedExpanded = chevronSelectedExpanded; } @NotNull public final IconKey getChevronSelectedExpanded() { return this.chevronSelectedExpanded; }
/*    */    @Composable
/*    */   @NotNull
/*    */   public final IconKey chevron(boolean isExpanded, boolean isSelected, @Nullable Composer $composer, int $changed) {
/* 59 */     $composer.startReplaceGroup(-1298623757); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1298623757, $changed, -1, "org.jetbrains.jewel.ui.component.styling.LazyTreeIcons.chevron (LazyTreeStyling.kt:58)");  IconKey iconKey = 
/* 60 */       (isSelected && isExpanded) ? this.chevronSelectedExpanded : (
/* 61 */       (isSelected && !isExpanded) ? this.chevronSelectedCollapsed : (
/* 62 */       (!isSelected && isExpanded) ? this.chevronExpanded : 
/* 63 */       this.chevronCollapsed));
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return iconKey;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LazyTreeIcons))
/*    */       return false; 
/*    */     LazyTreeIcons lazyTreeIcons = (LazyTreeIcons)other;
/*    */     return !Intrinsics.areEqual(this.chevronCollapsed, lazyTreeIcons.chevronCollapsed) ? false : (!Intrinsics.areEqual(this.chevronExpanded, lazyTreeIcons.chevronExpanded) ? false : (!Intrinsics.areEqual(this.chevronSelectedCollapsed, lazyTreeIcons.chevronSelectedCollapsed) ? false : (!!Intrinsics.areEqual(this.chevronSelectedExpanded, lazyTreeIcons.chevronSelectedExpanded))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.chevronCollapsed.hashCode();
/*    */     result = result * 31 + this.chevronExpanded.hashCode();
/*    */     result = result * 31 + this.chevronSelectedCollapsed.hashCode();
/*    */     return result * 31 + this.chevronSelectedExpanded.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LazyTreeIcons(chevronCollapsed=" + this.chevronCollapsed + ", chevronExpanded=" + this.chevronExpanded + ", chevronSelectedCollapsed=" + this.chevronSelectedCollapsed + ", chevronSelectedExpanded=" + this.chevronSelectedExpanded + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/LazyTreeIcons$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\LazyTreeIcons.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */