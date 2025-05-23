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
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\b\b\007\030\000 \n2\0020\001:\001\nB\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\013"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/LinkIcons;", "", "dropdownChevron", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "externalLink", "<init>", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Lorg/jetbrains/jewel/ui/icon/IconKey;)V", "getDropdownChevron", "()Lorg/jetbrains/jewel/ui/icon/IconKey;", "getExternalLink", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class LinkIcons
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final IconKey dropdownChevron;
/*    */   @NotNull
/*    */   private final IconKey externalLink;
/*    */   public static final int $stable;
/*    */   
/*    */   public LinkIcons(@NotNull IconKey dropdownChevron, @NotNull IconKey externalLink) {
/* 67 */     this.dropdownChevron = dropdownChevron; this.externalLink = externalLink; } @NotNull public final IconKey getDropdownChevron() { return this.dropdownChevron; } @NotNull public final IconKey getExternalLink() { return this.externalLink; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LinkIcons))
/*    */       return false; 
/*    */     LinkIcons linkIcons = (LinkIcons)other;
/*    */     return !Intrinsics.areEqual(this.dropdownChevron, linkIcons.dropdownChevron) ? false : (!!Intrinsics.areEqual(this.externalLink, linkIcons.externalLink));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.dropdownChevron.hashCode();
/*    */     return result * 31 + this.externalLink.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LinkIcons(dropdownChevron=" + this.dropdownChevron + ", externalLink=" + this.externalLink + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/LinkIcons$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\LinkIcons.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */