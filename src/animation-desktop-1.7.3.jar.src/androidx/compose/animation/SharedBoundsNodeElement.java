/*    */ package androidx.compose.animation;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.node.ModifierNodeElement;
/*    */ import androidx.compose.ui.platform.InspectorInfo;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\b\b\030\0002\b\022\004\022\0020\0020\001B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\t\020\b\032\0020\004HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\003\032\0020\004HÆ\001J\b\020\n\032\0020\002H\026J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\016HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\022HÖ\001J\020\020\023\032\0020\0242\006\020\025\032\0020\002H\026J\f\020\026\032\0020\024*\0020\027H\026R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007¨\006\030"}, d2 = {"Landroidx/compose/animation/SharedBoundsNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/SharedBoundsNode;", "sharedElementState", "Landroidx/compose/animation/SharedElementInternalState;", "(Landroidx/compose/animation/SharedElementInternalState;)V", "getSharedElementState", "()Landroidx/compose/animation/SharedElementInternalState;", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "animation"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class SharedBoundsNodeElement
/*    */   extends ModifierNodeElement<SharedBoundsNode>
/*    */ {
/*    */   @NotNull
/*    */   private final SharedElementInternalState sharedElementState;
/*    */   public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public final SharedElementInternalState getSharedElementState() {
/* 52 */     return this.sharedElementState; } public SharedBoundsNodeElement(@NotNull SharedElementInternalState sharedElementState) { this.sharedElementState = sharedElementState; }
/*    */    @NotNull
/*    */   public SharedBoundsNode create() {
/* 55 */     return new SharedBoundsNode(this.sharedElementState);
/*    */   }
/*    */   public void update(@NotNull SharedBoundsNode node) {
/* 58 */     Intrinsics.checkNotNullParameter(node, "node"); node.setState$animation(this.sharedElementState);
/*    */   }
/*    */   
/*    */   public void inspectableProperties(@NotNull InspectorInfo $this$inspectableProperties) {
/* 62 */     Intrinsics.checkNotNullParameter($this$inspectableProperties, "<this>"); $this$inspectableProperties.setName("sharedBounds");
/* 63 */     $this$inspectableProperties.getProperties().set("sharedElementState", this.sharedElementState);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SharedElementInternalState component1() {
/*    */     return this.sharedElementState;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SharedBoundsNodeElement copy(@NotNull SharedElementInternalState sharedElementState) {
/*    */     Intrinsics.checkNotNullParameter(sharedElementState, "sharedElementState");
/*    */     return new SharedBoundsNodeElement(sharedElementState);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SharedBoundsNodeElement(sharedElementState=" + this.sharedElementState + ')';
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.sharedElementState.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SharedBoundsNodeElement))
/*    */       return false; 
/*    */     SharedBoundsNodeElement sharedBoundsNodeElement = (SharedBoundsNodeElement)other;
/*    */     return !!Intrinsics.areEqual(this.sharedElementState, sharedBoundsNodeElement.sharedElementState);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SharedBoundsNodeElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */