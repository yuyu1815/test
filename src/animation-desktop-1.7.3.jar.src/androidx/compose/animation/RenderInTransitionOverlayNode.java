/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.runtime.FloatState;
/*     */ import androidx.compose.runtime.MutableFloatState;
/*     */ import androidx.compose.runtime.PrimitiveSnapshotStateKt;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.graphics.ClipOp;
/*     */ import androidx.compose.ui.graphics.Path;
/*     */ import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawContext;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawTransform;
/*     */ import androidx.compose.ui.graphics.layer.GraphicsLayer;
/*     */ import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
/*     */ import androidx.compose.ui.modifier.ModifierLocal;
/*     */ import androidx.compose.ui.modifier.ModifierLocalModifierNode;
/*     */ import androidx.compose.ui.node.DelegatableNode;
/*     */ import androidx.compose.ui.node.DelegatableNodeKt;
/*     */ import androidx.compose.ui.node.DrawModifierNode;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000b\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\000\n\002\020\007\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\022\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\b\000\030\0002\0020\0012\0020\0022\0020\003:\0013B?\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\006\020\t\032\0020\n\022\032\020\013\032\026\022\004\022\0020\r\022\004\022\0020\016\022\006\022\004\030\0010\0170\f¢\006\002\020\020J\b\020.\032\0020/H\026J\b\0200\032\0020/H\026J\f\0201\032\0020/*\00202H\026R.\020\013\032\026\022\004\022\0020\r\022\004\022\0020\016\022\006\022\004\030\0010\0170\fX\016¢\006\016\n\000\032\004\b\021\020\022\"\004\b\023\020\024R\023\020\025\032\004\030\0010\0268F¢\006\006\032\004\b\027\020\030R\024\020\031\032\b\030\0010\032R\0020\000X\016¢\006\002\n\000R\023\020\033\032\004\030\0010\0348F¢\006\006\032\004\b\035\020\036R \020\006\032\b\022\004\022\0020\b0\007X\016¢\006\016\n\000\032\004\b\037\020 \"\004\b!\020\"R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b#\020$\"\004\b%\020&R+\020\t\032\0020\n2\006\020'\032\0020\n8F@FX\002¢\006\022\n\004\b,\020-\032\004\b(\020)\"\004\b*\020+¨\0064"}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "sharedScope", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "renderInOverlay", "Lkotlin/Function0;", "", "zIndexInOverlay", "", "clipInOverlay", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/animation/SharedTransitionScopeImpl;Lkotlin/jvm/functions/Function0;FLkotlin/jvm/functions/Function2;)V", "getClipInOverlay", "()Lkotlin/jvm/functions/Function2;", "setClipInOverlay", "(Lkotlin/jvm/functions/Function2;)V", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layerWithRenderer", "Landroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer;", "parentState", "Landroidx/compose/animation/SharedElementInternalState;", "getParentState", "()Landroidx/compose/animation/SharedElementInternalState;", "getRenderInOverlay", "()Lkotlin/jvm/functions/Function0;", "setRenderInOverlay", "(Lkotlin/jvm/functions/Function0;)V", "getSharedScope", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "setSharedScope", "(Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "<set-?>", "getZIndexInOverlay", "()F", "setZIndexInOverlay", "(F)V", "zIndexInOverlay$delegate", "Landroidx/compose/runtime/MutableFloatState;", "onAttach", "", "onDetach", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "LayerWithRenderer", "animation"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nRenderInTransitionOverlayNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,157:1\n79#2:158\n112#2,2:159\n*S KotlinDebug\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode\n*L\n91#1:158\n91#1:159,2\n*E\n"})
/*     */ public final class RenderInTransitionOverlayNode
/*     */   extends Modifier.Node
/*     */   implements DrawModifierNode, ModifierLocalModifierNode
/*     */ {
/*     */   @NotNull
/*     */   private SharedTransitionScopeImpl sharedScope;
/*     */   @NotNull
/*     */   private Function0<Boolean> renderInOverlay;
/*     */   @NotNull
/*     */   private Function2<? super LayoutDirection, ? super Density, ? extends Path> clipInOverlay;
/*     */   @NotNull
/*     */   private final MutableFloatState zIndexInOverlay$delegate;
/*     */   @Nullable
/*     */   private LayerWithRenderer layerWithRenderer;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public final SharedTransitionScopeImpl getSharedScope() {
/*  86 */     return this.sharedScope; } public final void setSharedScope(@NotNull SharedTransitionScopeImpl <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.sharedScope = <set-?>; } @NotNull
/*  87 */   public final Function0<Boolean> getRenderInOverlay() { return this.renderInOverlay; } public final void setRenderInOverlay(@NotNull Function0<Boolean> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.renderInOverlay = <set-?>; }
/*     */   @NotNull
/*  89 */   public final Function2<LayoutDirection, Density, Path> getClipInOverlay() { return (Function2)this.clipInOverlay; } public final void setClipInOverlay(@NotNull Function2<? super LayoutDirection, ? super Density, ? extends Path> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.clipInOverlay = <set-?>; } public RenderInTransitionOverlayNode(@NotNull SharedTransitionScopeImpl sharedScope, @NotNull Function0<Boolean> renderInOverlay, float zIndexInOverlay, @NotNull Function2<? super LayoutDirection, ? super Density, ? extends Path> clipInOverlay) { this.sharedScope = sharedScope; this.renderInOverlay = renderInOverlay; this.clipInOverlay = clipInOverlay;
/*     */     
/*  91 */     this.zIndexInOverlay$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(zIndexInOverlay); } public final float getZIndexInOverlay() { FloatState floatState = (FloatState)this.zIndexInOverlay$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 158 */       floatState.getFloatValue(); }
/* 159 */   @Nullable public final SharedElementInternalState getParentState() { return (SharedElementInternalState)getCurrent((ModifierLocal)SharedContentNodeKt.getModifierLocalSharedElementInternalState()); } public final void setZIndexInOverlay(float <set-?>) { MutableFloatState mutableFloatState = this.zIndexInOverlay$delegate; KProperty property$iv = null; int $i$f$setValue = 0; mutableFloatState.setFloatValue(<set-?>); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\017\032\0020\0202\006\020\021\032\0020\022H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006R\026\020\007\032\004\030\0010\b8VX\004¢\006\006\032\004\b\t\020\nR\024\020\013\032\0020\f8VX\004¢\006\006\032\004\b\r\020\016¨\006\023"}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer;", "Landroidx/compose/animation/LayerRenderer;", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(Landroidx/compose/animation/RenderInTransitionOverlayNode;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentState", "Landroidx/compose/animation/SharedElementInternalState;", "getParentState", "()Landroidx/compose/animation/SharedElementInternalState;", "zIndex", "", "getZIndex", "()F", "drawInOverlay", "", "drawScope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "animation"}) @SourceDebugExtension({"SMAP\nRenderInTransitionOverlayNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,157:1\n70#2,4:158\n244#3,5:162\n272#3,9:167\n128#3,7:176\n282#3,4:183\n128#3,7:187\n*S KotlinDebug\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer\n*L\n106#1:158,4\n111#1:162,5\n111#1:167,9\n112#1:176,7\n111#1:183,4\n117#1:187,7\n*E\n"}) private final class LayerWithRenderer implements LayerRenderer { public void drawInOverlay(@NotNull DrawScope drawScope) { Intrinsics.checkNotNullParameter(drawScope, "drawScope"); if (((Boolean)RenderInTransitionOverlayNode.this.getRenderInOverlay().invoke()).booleanValue()) {
/*     */         RenderInTransitionOverlayNode renderInTransitionOverlayNode = RenderInTransitionOverlayNode.this; DrawScope $this$drawInOverlay_u24lambda_u243 = drawScope; int $i$a$-with-RenderInTransitionOverlayNode$LayerWithRenderer$drawInOverlay$1 = 0; long l1 = renderInTransitionOverlayNode.getSharedScope().getRoot$animation().localPositionOf-R5De75A(DelegatableNodeKt.requireLayoutCoordinates((DelegatableNode)renderInTransitionOverlayNode), Offset.Companion.getZero-F1C5BW0()); int $i$f$component1-impl = 0; float x = Offset.getX-impl(l1); int $i$f$component2-impl = 0;
/* 161 */         float y = Offset.getY-impl(l1);
/*     */         Path clipPath = (Path)renderInTransitionOverlayNode.getClipInOverlay().invoke($this$drawInOverlay_u24lambda_u243.getLayoutDirection(), DelegatableNodeKt.requireDensity((DelegatableNode)renderInTransitionOverlayNode));
/*     */         DrawScope $this$clipPath_u2dKD09W0M_u24default$iv = $this$drawInOverlay_u24lambda_u243;
/* 164 */         int clipOp$iv = ClipOp.Companion.getIntersect-rtfAjoo();
/*     */         int $i$f$clipPath-KD09W0M = 0;
/* 166 */         DrawScope $this$withTransform$iv$iv = $this$clipPath_u2dKD09W0M_u24default$iv; int $i$f$withTransform = 0;
/* 167 */         DrawContext $this$withTransform_u24lambda_u246$iv$iv = $this$withTransform$iv$iv.getDrawContext(); int $i$a$-with-DrawScopeKt$withTransform$1$iv$iv = 0;
/*     */ 
/*     */ 
/*     */         
/* 171 */         long previousSize$iv$iv = $this$withTransform_u24lambda_u246$iv$iv.getSize-NH-jbRc();
/* 172 */         $this$withTransform_u24lambda_u246$iv$iv.getCanvas().save();
/*     */         try {
/* 174 */           DrawTransform $this$clipPath_KD09W0M_u24lambda_u245$iv = $this$withTransform_u24lambda_u246$iv$iv.getTransform(); int $i$a$-withTransform-DrawScopeKt$clipPath$1$iv = 0; $this$clipPath_KD09W0M_u24lambda_u245$iv.clipPath-mtrdD-E(clipPath, clipOp$iv);
/* 175 */           DrawScope $this$drawInOverlay_u24lambda_u243_u24lambda_u241 = $this$withTransform$iv$iv; int $i$a$-clipPath-KD09W0M$default-RenderInTransitionOverlayNode$LayerWithRenderer$drawInOverlay$1$1 = 0; DrawScope drawScope1 = $this$drawInOverlay_u24lambda_u243_u24lambda_u241; int i = 0;
/* 176 */           drawScope1.getDrawContext().getTransform().translate(x, y);
/*     */           try {
/* 178 */             DrawScope $this$drawInOverlay_u24lambda_u243_u24lambda_u241_u24lambda_u240 = drawScope1; int $i$a$-translate-RenderInTransitionOverlayNode$LayerWithRenderer$drawInOverlay$1$1$1 = 0; GraphicsLayerKt.drawLayer($this$drawInOverlay_u24lambda_u243_u24lambda_u241_u24lambda_u240, this.layer);
/*     */           } finally {
/* 180 */             drawScope1.getDrawContext().getTransform().translate(-x, -y);
/*     */           } 
/*     */         } finally {
/* 183 */           $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();
/* 184 */           $this$withTransform_u24lambda_u246$iv$iv.setSize-uvyYCjk(previousSize$iv$iv);
/*     */         }  DrawScope $this$translate$iv = $this$drawInOverlay_u24lambda_u243;
/*     */         int $i$f$translate = 0;
/* 187 */         $this$translate$iv.getDrawContext().getTransform().translate(x, y);
/*     */         try {
/* 189 */           DrawScope $this$drawInOverlay_u24lambda_u243_u24lambda_u242 = $this$translate$iv; int $i$a$-translate-RenderInTransitionOverlayNode$LayerWithRenderer$drawInOverlay$1$2 = 0; GraphicsLayerKt.drawLayer($this$drawInOverlay_u24lambda_u243_u24lambda_u242, this.layer);
/*     */         } finally {
/* 191 */           $this$translate$iv.getDrawContext().getTransform().translate(-x, -y);
/*     */         } 
/*     */       }  }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     private final GraphicsLayer layer;
/*     */     
/*     */     public LayerWithRenderer(GraphicsLayer layer) {
/*     */       this.layer = layer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final GraphicsLayer getLayer() {
/*     */       return this.layer;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public SharedElementInternalState getParentState() {
/*     */       return RenderInTransitionOverlayNode.this.getParentState();
/*     */     }
/*     */     
/*     */     public float getZIndex() {
/*     */       return RenderInTransitionOverlayNode.this.getZIndexInOverlay();
/*     */     } }
/*     */ 
/*     */   
/*     */   public void draw(@NotNull ContentDrawScope $this$draw) {
/*     */     GraphicsLayer layer;
/*     */     Intrinsics.checkNotNullParameter($this$draw, "<this>");
/*     */     if (getLayer() == null) {
/*     */       getLayer();
/*     */       int $i$a$-requireNotNull-RenderInTransitionOverlayNode$draw$layer$1 = 0;
/*     */       String str = "Error: layer never initialized";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     DrawScope.record-JVtK1S4$default((DrawScope)$this$draw, layer, 0L, new RenderInTransitionOverlayNode$draw$1($this$draw), 1, null);
/*     */     if (!((Boolean)this.renderInOverlay.invoke()).booleanValue())
/*     */       GraphicsLayerKt.drawLayer((DrawScope)$this$draw, layer); 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"})
/*     */   static final class RenderInTransitionOverlayNode$draw$1 extends Lambda implements Function1<DrawScope, Unit> {
/*     */     public final void invoke(@NotNull DrawScope $this$record) {
/*     */       Intrinsics.checkNotNullParameter($this$record, "$this$record");
/*     */       this.$this_draw.drawContent();
/*     */     }
/*     */     
/*     */     RenderInTransitionOverlayNode$draw$1(ContentDrawScope $receiver) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final GraphicsLayer getLayer() {
/*     */     return (this.layerWithRenderer != null) ? this.layerWithRenderer.getLayer() : null;
/*     */   }
/*     */   
/*     */   public void onAttach() {
/*     */     LayerWithRenderer it = new LayerWithRenderer(DelegatableNodeKt.requireGraphicsContext((DelegatableNode)this).createGraphicsLayer());
/*     */     int $i$a$-let-RenderInTransitionOverlayNode$onAttach$1 = 0;
/*     */     this.sharedScope.onLayerRendererCreated$animation(it);
/*     */     this.layerWithRenderer = it;
/*     */   }
/*     */   
/*     */   public void onDetach() {
/*     */     LayerWithRenderer it = this.layerWithRenderer;
/*     */     int $i$a$-let-RenderInTransitionOverlayNode$onDetach$1 = 0;
/*     */     this.sharedScope.onLayerRendererRemoved$animation(it);
/*     */     DelegatableNodeKt.requireGraphicsContext((DelegatableNode)this).releaseGraphicsLayer(it.getLayer());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\RenderInTransitionOverlayNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */