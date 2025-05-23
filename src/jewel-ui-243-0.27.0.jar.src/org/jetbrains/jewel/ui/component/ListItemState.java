/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\007\b\007\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\004\020\bR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\n"}, d2 = {"Lorg/jetbrains/jewel/ui/component/ListItemState;", "", "isSelected", "", "isHovered", "previewSelection", "<init>", "(ZZZ)V", "()Z", "getPreviewSelection", "ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class ListItemState
/*    */ {
/*    */   private final boolean isSelected;
/*    */   private final boolean isHovered;
/*    */   private final boolean previewSelection;
/*    */   public static final int $stable;
/*    */   
/*    */   public ListItemState(boolean isSelected, boolean isHovered, boolean previewSelection) {
/* 62 */     this.isSelected = isSelected;
/* 63 */     this.isHovered = isHovered;
/* 64 */     this.previewSelection = previewSelection; } public final boolean getPreviewSelection() { return this.previewSelection; }
/*    */ 
/*    */   
/*    */   public final boolean isSelected() {
/*    */     return this.isSelected;
/*    */   }
/*    */   
/*    */   public final boolean isHovered() {
/*    */     return this.isHovered;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ListItemState))
/*    */       return false; 
/*    */     ListItemState listItemState = (ListItemState)other;
/*    */     return (this.isSelected != listItemState.isSelected) ? false : ((this.isHovered != listItemState.isHovered) ? false : (!(this.previewSelection != listItemState.previewSelection)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Boolean.hashCode(this.isSelected);
/*    */     result = result * 31 + Boolean.hashCode(this.isHovered);
/*    */     return result * 31 + Boolean.hashCode(this.previewSelection);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ListItemState(isSelected=" + this.isSelected + ", isHovered=" + this.isHovered + ", previewSelection=" + this.previewSelection + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ListItemState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */