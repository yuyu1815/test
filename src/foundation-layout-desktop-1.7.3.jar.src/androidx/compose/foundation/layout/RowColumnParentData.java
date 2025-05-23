/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\031\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B1\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t¢\006\002\020\nJ\t\020\033\032\0020\003HÆ\003J\t\020\034\032\0020\005HÆ\003J\013\020\035\032\004\030\0010\007HÆ\003J\013\020\036\032\004\030\0010\tHÆ\003J5\020\037\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\tHÆ\001J\023\020 \032\0020\0052\b\020!\032\004\030\0010\001HÖ\003J\t\020\"\032\0020#HÖ\001J\t\020$\032\0020%HÖ\001R\034\020\006\032\004\030\0010\007X\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\022R\034\020\b\032\004\030\0010\tX\016¢\006\016\n\000\032\004\b\023\020\024\"\004\b\025\020\026R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\027\020\030\"\004\b\031\020\032¨\006&"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnParentData;", "", "weight", "", "fill", "", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "flowLayoutData", "Landroidx/compose/foundation/layout/FlowLayoutData;", "(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;Landroidx/compose/foundation/layout/FlowLayoutData;)V", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "setCrossAxisAlignment", "(Landroidx/compose/foundation/layout/CrossAxisAlignment;)V", "getFill", "()Z", "setFill", "(Z)V", "getFlowLayoutData", "()Landroidx/compose/foundation/layout/FlowLayoutData;", "setFlowLayoutData", "(Landroidx/compose/foundation/layout/FlowLayoutData;)V", "getWeight", "()F", "setWeight", "(F)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "foundation-layout"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class RowColumnParentData
/*     */ {
/*     */   private float weight;
/*     */   private boolean fill;
/*     */   @Nullable
/*     */   private CrossAxisAlignment crossAxisAlignment;
/*     */   @Nullable
/*     */   private FlowLayoutData flowLayoutData;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public final float getWeight() {
/*     */     return this.weight;
/*     */   }
/*     */   
/*     */   public final void setWeight(float <set-?>) {
/*     */     this.weight = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getFill() {
/*     */     return this.fill;
/*     */   }
/*     */   
/*     */   public final void setFill(boolean <set-?>) {
/*     */     this.fill = <set-?>;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final CrossAxisAlignment getCrossAxisAlignment() {
/*     */     return this.crossAxisAlignment;
/*     */   }
/*     */   
/*     */   public final void setCrossAxisAlignment(@Nullable CrossAxisAlignment <set-?>) {
/*     */     this.crossAxisAlignment = <set-?>;
/*     */   }
/*     */   
/*     */   public RowColumnParentData(float weight, boolean fill, @Nullable CrossAxisAlignment crossAxisAlignment, @Nullable FlowLayoutData flowLayoutData) {
/* 698 */     this.weight = weight;
/* 699 */     this.fill = fill;
/* 700 */     this.crossAxisAlignment = crossAxisAlignment;
/* 701 */     this.flowLayoutData = flowLayoutData; } @Nullable public final FlowLayoutData getFlowLayoutData() { return this.flowLayoutData; } public final void setFlowLayoutData(@Nullable FlowLayoutData <set-?>) { this.flowLayoutData = <set-?>; }
/*     */ 
/*     */   
/*     */   public final float component1() {
/*     */     return this.weight;
/*     */   }
/*     */   
/*     */   public final boolean component2() {
/*     */     return this.fill;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final CrossAxisAlignment component3() {
/*     */     return this.crossAxisAlignment;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final FlowLayoutData component4() {
/*     */     return this.flowLayoutData;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RowColumnParentData copy(float weight, boolean fill, @Nullable CrossAxisAlignment crossAxisAlignment, @Nullable FlowLayoutData flowLayoutData) {
/*     */     return new RowColumnParentData(weight, fill, crossAxisAlignment, flowLayoutData);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ", flowLayoutData=" + this.flowLayoutData + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Float.hashCode(this.weight);
/*     */     result = result * 31 + Boolean.hashCode(this.fill);
/*     */     result = result * 31 + ((this.crossAxisAlignment == null) ? 0 : this.crossAxisAlignment.hashCode());
/*     */     return result * 31 + ((this.flowLayoutData == null) ? 0 : this.flowLayoutData.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof RowColumnParentData))
/*     */       return false; 
/*     */     RowColumnParentData rowColumnParentData = (RowColumnParentData)other;
/*     */     return (Float.compare(this.weight, rowColumnParentData.weight) != 0) ? false : ((this.fill != rowColumnParentData.fill) ? false : (!Intrinsics.areEqual(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment) ? false : (!!Intrinsics.areEqual(this.flowLayoutData, rowColumnParentData.flowLayoutData))));
/*     */   }
/*     */   
/*     */   public RowColumnParentData() {
/*     */     this(0.0F, false, null, null, 15, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\RowColumnParentData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */