/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.gestures.DraggableState;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.platform.InspectorInfo;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Slider.kt\norg/jetbrains/jewel/ui/component/SliderKt\n*L\n1#1,178:1\n483#2,10:179\n*E\n"})
/*     */ public final class SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
/*     */   extends Lambda
/*     */   implements Function1<InspectorInfo, Unit>
/*     */ {
/*     */   public SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(DraggableState paramDraggableState, MutableInteractionSource paramMutableInteractionSource, float paramFloat, boolean paramBoolean1, State paramState1, State paramState2, MutableState paramMutableState, boolean paramBoolean2) {
/*     */     super(1);
/*     */   }
/*     */   
/*     */   public final void invoke(@NotNull InspectorInfo $this$null) {
/* 135 */     Intrinsics.checkNotNullParameter($this$null, "$this$null"); InspectorInfo $this$sliderTapModifier_u24lambda_u2428 = $this$null; int $i$a$-debugInspectorInfo-SliderKt$sliderTapModifier$1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 179 */     $this$sliderTapModifier_u24lambda_u2428.setName("sliderTapModifier");
/* 180 */     $this$sliderTapModifier_u24lambda_u2428.getProperties().set("draggableState", this.$draggableState$inlined);
/* 181 */     $this$sliderTapModifier_u24lambda_u2428.getProperties().set("interactionSource", this.$interactionSource$inlined);
/* 182 */     $this$sliderTapModifier_u24lambda_u2428.getProperties().set("maxPx", Float.valueOf(this.$maxPx$inlined));
/* 183 */     $this$sliderTapModifier_u24lambda_u2428.getProperties().set("isRtl", Boolean.valueOf(this.$isRtl$inlined));
/* 184 */     $this$sliderTapModifier_u24lambda_u2428.getProperties().set("rawOffset", this.$rawOffset$inlined);
/* 185 */     $this$sliderTapModifier_u24lambda_u2428.getProperties().set("gestureEndAction", this.$gestureEndAction$inlined);
/* 186 */     $this$sliderTapModifier_u24lambda_u2428.getProperties().set("pressOffset", this.$pressOffset$inlined);
/* 187 */     $this$sliderTapModifier_u24lambda_u2428.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */