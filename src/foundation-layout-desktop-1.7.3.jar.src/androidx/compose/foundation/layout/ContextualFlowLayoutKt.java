/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.SubcomposeMeasureScope;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000x\n\000\n\002\020\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\005\032\001\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0032\b\b\002\020\013\032\0020\0032\b\b\002\020\f\032\0020\r21\020\016\032-\022\004\022\0020\020\022\023\022\0210\003¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\004\022\0020\0010\017¢\006\002\b\024¢\006\002\b\025H\007¢\006\002\020\026\032\001\020\027\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\b\032\0020\t2\b\b\002\020\006\032\0020\0072\b\b\002\020\030\032\0020\0032\b\b\002\020\013\032\0020\0032\b\b\002\020\f\032\0020\03121\020\016\032-\022\004\022\0020\032\022\023\022\0210\003¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\004\022\0020\0010\017¢\006\002\b\024¢\006\002\b\025H\007¢\006\002\020\033\032¥\001\020\034\032\024\022\004\022\0020\035\022\004\022\0020\036\022\004\022\0020\0370\0172\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020 \032\0020\0032\006\020\013\032\0020\0032\006\020!\032\0020\"2\006\020\002\032\0020\0032\027\020#\032\023\022\017\022\r\022\004\022\0020\0010%¢\006\002\b\0240$2;\020&\0327\022\023\022\0210\003¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\023\022\0210'¢\006\f\b\021\022\b\b\022\022\004\b\b((\022\004\022\0020\0010\017¢\006\002\b\024H\001¢\006\002\020)\032¥\001\020*\032\024\022\004\022\0020\035\022\004\022\0020\036\022\004\022\0020\0370\0172\006\020\b\032\0020\t2\006\020\006\032\0020\0072\006\020 \032\0020\0032\006\020\013\032\0020\0032\006\020!\032\0020\"2\006\020\002\032\0020\0032\027\020#\032\023\022\017\022\r\022\004\022\0020\0010%¢\006\002\b\0240$2;\020&\0327\022\023\022\0210\003¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\023\022\0210'¢\006\f\b\021\022\b\b\022\022\004\b\b((\022\004\022\0020\0010\017¢\006\002\b\024H\001¢\006\002\020+¨\006,"}, d2 = {"ContextualFlowColumn", "", "itemCount", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "maxItemsInEachColumn", "maxLines", "overflow", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;", "content", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ContextualFlowColumnScope;", "Lkotlin/ParameterName;", "name", "index", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/ContextualFlowColumnOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "ContextualFlowRow", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/ContextualFlowRowOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "contextualColumnMeasureHelper", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "maxItemsInMainAxis", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowComposables", "", "Lkotlin/Function0;", "getComposable", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "contextualRowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,564:1\n1225#2,6:565\n1225#2,6:571\n1225#2,6:577\n1225#2,6:583\n1225#2,6:589\n1225#2,6:595\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowLayoutKt\n*L\n75#1:565,6\n78#1:571,6\n150#1:577,6\n153#1:583,6\n344#1:589,6\n384#1:595,6\n*E\n"})
/*     */ public final class ContextualFlowLayoutKt
/*     */ {
/*     */   @Composable
/*     */   @ExperimentalLayoutApi
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void ContextualFlowRow(int itemCount, @Nullable Modifier modifier, @Nullable Arrangement.Horizontal horizontalArrangement, @Nullable Arrangement.Vertical verticalArrangement, int maxItemsInEachRow, int maxLines, @Nullable ContextualFlowRowOverflow overflow, @NotNull Function4<? super ContextualFlowRowScope, ? super Integer, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*  74 */     Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(-341770689); ComposerKt.sourceInformation($composer, "C(ContextualFlowRow)P(2,5,1,7,3,4,6)74@3434L65,77@3545L193,90@3961L267,82@3763L465,99@4233L90:ContextualFlowLayout.kt#2w3rfo"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x6; } else if (($changed & 0x6) == 0) { $dirty |= $composer.changed(itemCount) ? 4 : 2; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changed(modifier) ? 32 : 16; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changed(horizontalArrangement) ? 256 : 128; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(verticalArrangement) ? 2048 : 1024; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changed(maxItemsInEachRow) ? 16384 : 8192; }  if ((paramInt1 & 0x20) != 0) { $dirty |= 0x30000; } else if (($changed & 0x30000) == 0) { $dirty |= $composer.changed(maxLines) ? 131072 : 65536; }  if ((paramInt1 & 0x40) != 0) { $dirty |= 0x180000; } else if (($changed & 0x180000) == 0) { $dirty |= $composer.changed(overflow) ? 1048576 : 524288; }  if ((paramInt1 & 0x80) != 0) { $dirty |= 0xC00000; } else if (($changed & 0xC00000) == 0) { $dirty |= $composer.changedInstance(content) ? 8388608 : 4194304; }  if (($dirty & 0x492493) != 4793490 || !$composer.getSkipping()) { if ((paramInt1 & 0x2) != 0) {
/*     */         modifier = (Modifier)Modifier.Companion;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       if ((paramInt1 & 0x4) != 0) {
/*     */         horizontalArrangement = Arrangement.INSTANCE.getStart();
/*     */       } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new ContextualFlowLayoutKt$ContextualFlowRow$1(itemCount, modifier, horizontalArrangement, verticalArrangement, maxItemsInEachRow, maxLines, overflow, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*     */   
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class ContextualFlowLayoutKt$ContextualFlowRow$1
/*     */     extends Lambda
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     ContextualFlowLayoutKt$ContextualFlowRow$1(int $itemCount, Modifier $modifier, Arrangement.Horizontal $horizontalArrangement, Arrangement.Vertical $verticalArrangement, int $maxItemsInEachRow, int $maxLines, ContextualFlowRowOverflow $overflow, Function4<ContextualFlowRowScope, Integer, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       ContextualFlowLayoutKt.ContextualFlowRow(this.$itemCount, this.$modifier, this.$horizontalArrangement, this.$verticalArrangement, this.$maxItemsInEachRow, this.$maxLines, this.$overflow, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\013¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "index", "", "info", "Landroidx/compose/foundation/layout/FlowLineInfo;", "invoke", "(ILandroidx/compose/foundation/layout/FlowLineInfo;Landroidx/compose/runtime/Composer;I)V"})
/*     */   static final class ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
/*     */     extends Lambda
/*     */     implements Function4<Integer, FlowLineInfo, Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(int index, @NotNull FlowLineInfo info, @Nullable Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter(info, "info");
/*     */       ComposerKt.sourceInformation($composer, "C97@4208L14:ContextualFlowLayout.kt#2w3rfo");
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(-8464804, $changed, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:91)"); 
/*     */       ContextualFlowRowScopeImpl scope = new ContextualFlowRowScopeImpl(info.getLineIndex$foundation_layout(), info.getPositionInLine$foundation_layout(), info.getMaxMainAxisSize-D9Ej5fM$foundation_layout(), info.getMaxCrossAxisSize-D9Ej5fM$foundation_layout(), null);
/*     */       this.$content.invoke(scope, Integer.valueOf(index), $composer, Integer.valueOf(0x70 & $changed << 3));
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */     }
/*     */     
/*     */     ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1(Function4<ContextualFlowRowScope, Integer, Composer, Integer, Unit> $content) {
/*     */       super(4);
/*     */     }
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ExperimentalLayoutApi
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void ContextualFlowColumn(int itemCount, @Nullable Modifier modifier, @Nullable Arrangement.Vertical verticalArrangement, @Nullable Arrangement.Horizontal horizontalArrangement, int maxItemsInEachColumn, int maxLines, @Nullable ContextualFlowColumnOverflow overflow, @NotNull Function4<? super ContextualFlowColumnScope, ? super Integer, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 149 */     Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(-588476895); ComposerKt.sourceInformation($composer, "C(ContextualFlowColumn)P(2,5,7,1,3,4,6)149@6671L65,152@6782L193,165@7201L270,157@7000L471,175@7477L90:ContextualFlowLayout.kt#2w3rfo"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x6; } else if (($changed & 0x6) == 0) { $dirty |= $composer.changed(itemCount) ? 4 : 2; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changed(modifier) ? 32 : 16; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changed(verticalArrangement) ? 256 : 128; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(horizontalArrangement) ? 2048 : 1024; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changed(maxItemsInEachColumn) ? 16384 : 8192; }  if ((paramInt1 & 0x20) != 0) { $dirty |= 0x30000; } else if (($changed & 0x30000) == 0) { $dirty |= $composer.changed(maxLines) ? 131072 : 65536; }  if ((paramInt1 & 0x40) != 0) { $dirty |= 0x180000; } else if (($changed & 0x180000) == 0) { $dirty |= $composer.changed(overflow) ? 1048576 : 524288; }  if ((paramInt1 & 0x80) != 0) { $dirty |= 0xC00000; } else if (($changed & 0xC00000) == 0) { $dirty |= $composer.changedInstance(content) ? 8388608 : 4194304; }  if (($dirty & 0x492493) != 4793490 || !$composer.getSkipping()) { if ((paramInt1 & 0x2) != 0) {
/*     */         modifier = (Modifier)Modifier.Companion;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       if ((paramInt1 & 0x4) != 0) {
/*     */         verticalArrangement = Arrangement.INSTANCE.getTop();
/*     */       } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new ContextualFlowLayoutKt$ContextualFlowColumn$1(itemCount, modifier, verticalArrangement, horizontalArrangement, maxItemsInEachColumn, maxLines, overflow, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class ContextualFlowLayoutKt$ContextualFlowColumn$1
/*     */     extends Lambda
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     ContextualFlowLayoutKt$ContextualFlowColumn$1(int $itemCount, Modifier $modifier, Arrangement.Vertical $verticalArrangement, Arrangement.Horizontal $horizontalArrangement, int $maxItemsInEachColumn, int $maxLines, ContextualFlowColumnOverflow $overflow, Function4<ContextualFlowColumnScope, Integer, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       ContextualFlowLayoutKt.ContextualFlowColumn(this.$itemCount, this.$modifier, this.$verticalArrangement, this.$horizontalArrangement, this.$maxItemsInEachColumn, this.$maxLines, this.$overflow, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\013¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "index", "", "info", "Landroidx/compose/foundation/layout/FlowLineInfo;", "invoke", "(ILandroidx/compose/foundation/layout/FlowLineInfo;Landroidx/compose/runtime/Composer;I)V"})
/*     */   static final class ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
/*     */     extends Lambda
/*     */     implements Function4<Integer, FlowLineInfo, Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(int index, @NotNull FlowLineInfo info, @Nullable Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter(info, "info");
/*     */       ComposerKt.sourceInformation($composer, "C172@7451L14:ContextualFlowLayout.kt#2w3rfo");
/*     */       if (ComposerKt.isTraceInProgress()) {
/*     */         ComposerKt.traceEventStart(302435318, $changed, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:166)");
/*     */       }
/*     */       int i = info.getLineIndex$foundation_layout();
/*     */       int j = info.getPositionInLine$foundation_layout();
/*     */       float f1 = info.getMaxMainAxisSize-D9Ej5fM$foundation_layout();
/*     */       float f2 = info.getMaxCrossAxisSize-D9Ej5fM$foundation_layout();
/*     */       ContextualFlowColumnScopeImpl scope = new ContextualFlowColumnScopeImpl(i, j, f2, f1, null);
/*     */       this.$content.invoke(scope, Integer.valueOf(index), $composer, Integer.valueOf(0x70 & $changed << 3));
/*     */       if (ComposerKt.isTraceInProgress()) {
/*     */         ComposerKt.traceEventEnd();
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1(Function4<ContextualFlowColumnScope, Integer, Composer, Integer, Unit> $content) {
/*     */       super(4);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> contextualRowMeasurementHelper(@NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Arrangement.Vertical verticalArrangement, int maxItemsInMainAxis, int maxLines, @NotNull FlowLayoutOverflowState overflowState, int itemCount, @NotNull List overflowComposables, @NotNull Function4 getComposable, @Nullable Composer $composer, int $changed) {
/* 343 */     Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement"); Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement"); Intrinsics.checkNotNullParameter(overflowState, "overflowState"); Intrinsics.checkNotNullParameter(overflowComposables, "overflowComposables"); Intrinsics.checkNotNullParameter(getComposable, "getComposable"); ComposerKt.sourceInformationMarkerStart($composer, -43351224, "C(contextualRowMeasurementHelper)P(1,7,3,4,6,2,5)343@13891L847:ContextualFlowLayout.kt#2w3rfo"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-43351224, $changed, -1, "androidx.compose.foundation.layout.contextualRowMeasurementHelper (ContextualFlowLayout.kt:342)"); 
/* 344 */     ComposerKt.sourceInformationMarkerStart($composer, 1138967354, "CC(remember):ContextualFlowLayout.kt#9igjgp"); Composer composer = $composer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 351 */     int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(horizontalArrangement)) || ($changed & 0x6) == 4) ? 1 : 0) | (((($changed & 0x70 ^ 0x30) > 32 && $composer.changed(verticalArrangement)) || ($changed & 0x30) == 32) ? 1 : 0) | (((($changed & 0x380 ^ 0x180) > 256 && $composer.changed(maxItemsInMainAxis)) || ($changed & 0x180) == 256) ? 1 : 0) | (((($changed & 0x1C00 ^ 0xC00) > 2048 && $composer.changed(maxLines)) || ($changed & 0xC00) == 2048) ? 1 : 0) | $composer.changed(overflowState) | (((($changed & 0x70000 ^ 0x30000) > 131072 && $composer.changed(itemCount)) || ($changed & 0x30000) == 131072) ? 1 : 0) | (((($changed & 0x1C00000 ^ 0xC00000) > 8388608 && $composer.changed(getComposable)) || ($changed & 0xC00000) == 8388608) ? 1 : 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 589 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 590 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 591 */       int $i$a$-cache-ContextualFlowLayoutKt$contextualRowMeasurementHelper$1 = 0; float f1 = horizontalArrangement.getSpacing-D9Ej5fM(); CrossAxisAlignment crossAxisAlignment = FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_TOP();
/*     */       float f2 = verticalArrangement.getSpacing-D9Ej5fM();
/*     */     } 
/* 594 */     Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function22 = (Function2)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function21 = function22; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return function21; } @Composable @NotNull public static final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> contextualColumnMeasureHelper(@NotNull Arrangement.Vertical verticalArrangement, @NotNull Arrangement.Horizontal horizontalArrangement, int maxItemsInMainAxis, int maxLines, @NotNull FlowLayoutOverflowState overflowState, int itemCount, @NotNull List overflowComposables, @NotNull Function4 getComposable, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement"); Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement"); Intrinsics.checkNotNullParameter(overflowState, "overflowState"); Intrinsics.checkNotNullParameter(overflowComposables, "overflowComposables"); Intrinsics.checkNotNullParameter(getComposable, "getComposable"); ComposerKt.sourceInformationMarkerStart($composer, 1009762916, "C(contextualColumnMeasureHelper)P(7,1,3,4,6,2,5)383@15228L850:ContextualFlowLayout.kt#2w3rfo"); if (ComposerKt.isTraceInProgress())
/* 595 */       ComposerKt.traceEventStart(1009762916, $changed, -1, "androidx.compose.foundation.layout.contextualColumnMeasureHelper (ContextualFlowLayout.kt:382)");  ComposerKt.sourceInformationMarkerStart($composer, -1978242771, "CC(remember):ContextualFlowLayout.kt#9igjgp"); Composer composer = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(verticalArrangement)) || ($changed & 0x6) == 4) ? 1 : 0) | (((($changed & 0x70 ^ 0x30) > 32 && $composer.changed(horizontalArrangement)) || ($changed & 0x30) == 32) ? 1 : 0) | (((($changed & 0x380 ^ 0x180) > 256 && $composer.changed(maxItemsInMainAxis)) || ($changed & 0x180) == 256) ? 1 : 0) | (((($changed & 0x1C00 ^ 0xC00) > 2048 && $composer.changed(maxLines)) || ($changed & 0xC00) == 2048) ? 1 : 0) | $composer.changed(overflowState) | (((($changed & 0x70000 ^ 0x30000) > 131072 && $composer.changed(itemCount)) || ($changed & 0x30000) == 131072) ? 1 : 0) | (((($changed & 0x1C00000 ^ 0xC00000) > 8388608 && $composer.changed(getComposable)) || ($changed & 0xC00000) == 8388608) ? 1 : 0); int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 596 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 597 */       int $i$a$-cache-ContextualFlowLayoutKt$contextualColumnMeasureHelper$1 = 0; float f1 = verticalArrangement.getSpacing-D9Ej5fM(); CrossAxisAlignment crossAxisAlignment = FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_START();
/*     */       float f2 = horizontalArrangement.getSpacing-D9Ej5fM();
/*     */     } 
/* 600 */     Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function22 = (Function2)it$iv;
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function21 = function22;
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return function21; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\ContextualFlowLayoutKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */