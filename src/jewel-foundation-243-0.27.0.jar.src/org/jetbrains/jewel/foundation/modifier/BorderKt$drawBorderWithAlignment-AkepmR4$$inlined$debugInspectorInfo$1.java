/*     */ package org.jetbrains.jewel.foundation.modifier;
/*     */ 
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.Shape;
/*     */ import androidx.compose.ui.graphics.SolidColor;
/*     */ import androidx.compose.ui.platform.InspectorInfo;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.foundation.Stroke;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003¨\006\004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"})
/*     */ @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Border.kt\norg/jetbrains/jewel/foundation/modifier/BorderKt\n*L\n1#1,178:1\n120#2,12:179\n*E\n"})
/*     */ public final class BorderKt$drawBorderWithAlignment-AkepmR4$$inlined$debugInspectorInfo$1
/*     */   extends Lambda
/*     */   implements Function1<InspectorInfo, Unit>
/*     */ {
/*     */   public BorderKt$drawBorderWithAlignment-AkepmR4$$inlined$debugInspectorInfo$1(Stroke.Alignment paramAlignment, float paramFloat1, Brush paramBrush, Shape paramShape, float paramFloat2) {
/*     */     super(1);
/*     */   }
/*     */   
/*     */   public final void invoke(@NotNull InspectorInfo $this$null) {
/* 135 */     Intrinsics.checkNotNullParameter($this$null, "$this$null"); InspectorInfo $this$drawBorderWithAlignment_AkepmR4_u24lambda_u240 = $this$null; int $i$a$-debugInspectorInfo-BorderKt$drawBorderWithAlignment$1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 179 */     $this$drawBorderWithAlignment_AkepmR4_u24lambda_u240.setName("border");
/* 180 */     $this$drawBorderWithAlignment_AkepmR4_u24lambda_u240.getProperties().set("alignment", this.$alignment$inlined);
/* 181 */     $this$drawBorderWithAlignment_AkepmR4_u24lambda_u240.getProperties().set("width", Dp.box-impl(this.$width$inlined));
/* 182 */     if (this.$brush$inlined instanceof SolidColor) {
/* 183 */       $this$drawBorderWithAlignment_AkepmR4_u24lambda_u240.getProperties().set("color", Color.box-impl(((SolidColor)this.$brush$inlined).getValue-0d7_KjU()));
/* 184 */       $this$drawBorderWithAlignment_AkepmR4_u24lambda_u240.setValue(Color.box-impl(((SolidColor)this.$brush$inlined).getValue-0d7_KjU()));
/*     */     } else {
/* 186 */       $this$drawBorderWithAlignment_AkepmR4_u24lambda_u240.getProperties().set("brush", this.$brush$inlined);
/*     */     } 
/* 188 */     $this$drawBorderWithAlignment_AkepmR4_u24lambda_u240.getProperties().set("shape", this.$shape$inlined);
/* 189 */     $this$drawBorderWithAlignment_AkepmR4_u24lambda_u240.getProperties().set("expand", Dp.box-impl(this.$expand$inlined));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\modifier\BorderKt$drawBorderWithAlignment-AkepmR4$$inlined$debugInspectorInfo$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */