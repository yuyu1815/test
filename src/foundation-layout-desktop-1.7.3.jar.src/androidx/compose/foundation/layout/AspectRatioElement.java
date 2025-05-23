/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.node.ModifierNodeElement;
/*     */ import androidx.compose.ui.platform.InspectorInfo;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\n\n\002\020\000\n\000\n\002\020\b\n\002\b\004\b\002\030\0002\b\022\004\022\0020\0020\001B.\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\027\020\007\032\023\022\004\022\0020\t\022\004\022\0020\n0\b¢\006\002\b\013¢\006\002\020\fJ\b\020\023\032\0020\002H\026J\023\020\024\032\0020\0062\b\020\025\032\004\030\0010\026H\002J\b\020\027\032\0020\030H\026J\020\020\031\032\0020\n2\006\020\032\032\0020\002H\026J\f\020\033\032\0020\n*\0020\tH\026R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\r\020\016R\"\020\007\032\023\022\004\022\0020\t\022\004\022\0020\n0\b¢\006\002\b\013¢\006\b\n\000\032\004\b\017\020\020R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\021\020\022¨\006\034"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/AspectRatioNode;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FZLkotlin/jvm/functions/Function1;)V", "getAspectRatio", "()F", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "getMatchHeightConstraintsFirst", "()Z", "create", "equals", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
/*     */ final class AspectRatioElement
/*     */   extends ModifierNodeElement<AspectRatioNode>
/*     */ {
/*     */   private final float aspectRatio;
/*     */   private final boolean matchHeightConstraintsFirst;
/*     */   @NotNull
/*     */   private final Function1<InspectorInfo, Unit> inspectorInfo;
/*     */   
/*     */   public final float getAspectRatio() {
/*  72 */     return this.aspectRatio;
/*  73 */   } public final boolean getMatchHeightConstraintsFirst() { return this.matchHeightConstraintsFirst; } @NotNull
/*  74 */   public final Function1<InspectorInfo, Unit> getInspectorInfo() { return this.inspectorInfo; } public AspectRatioElement(float aspectRatio, boolean matchHeightConstraintsFirst, @NotNull Function1<InspectorInfo, Unit> inspectorInfo) { this.aspectRatio = aspectRatio; this.matchHeightConstraintsFirst = matchHeightConstraintsFirst; this.inspectorInfo = inspectorInfo;
/*     */ 
/*     */     
/*  77 */     if (!((this.aspectRatio > 0.0F) ? 1 : 0)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 237 */       int $i$a$-require-AspectRatioElement$1 = 0;
/*     */       String str = "aspectRatio " + this.aspectRatio + " must be > 0";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     }  }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public AspectRatioNode create() {
/*     */     return new AspectRatioNode(this.aspectRatio, this.matchHeightConstraintsFirst);
/*     */   }
/*     */   
/*     */   public void update(@NotNull AspectRatioNode node) {
/*     */     Intrinsics.checkNotNullParameter(node, "node");
/*     */     node.setAspectRatio(this.aspectRatio);
/*     */     node.setMatchHeightConstraintsFirst(this.matchHeightConstraintsFirst);
/*     */   }
/*     */   
/*     */   public void inspectableProperties(@NotNull InspectorInfo $this$inspectableProperties) {
/*     */     Intrinsics.checkNotNullParameter($this$inspectableProperties, "<this>");
/*     */     this.inspectorInfo.invoke($this$inspectableProperties);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     Object object;
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (((other instanceof AspectRatioElement) ? other : null) == null) {
/*     */       (other instanceof AspectRatioElement) ? other : null;
/*     */       return false;
/*     */     } 
/*     */     return (((this.aspectRatio == ((AspectRatioElement)object).aspectRatio)) && this.matchHeightConstraintsFirst == ((AspectRatioElement)other).matchHeightConstraintsFirst);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return Float.hashCode(this.aspectRatio) * 31 + Boolean.hashCode(this.matchHeightConstraintsFirst);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\AspectRatioElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */