/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.UiComposable;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.SubcomposeMeasureScope;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\032N\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072!\020\b\032\035\022\004\022\0020\n\022\004\022\0020\0010\t¢\006\002\b\013¢\006\002\b\f¢\006\002\b\rH\007¢\006\002\020\016¨\006\017"}, d2 = {"BoxWithConstraints", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n1225#2,6:125\n*S KotlinDebug\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n*L\n67#1:125,6\n*E\n"})
/*     */ public final class BoxWithConstraintsKt
/*     */ {
/*     */   @Composable
/*     */   @UiComposable
/*     */   public static final void BoxWithConstraints(@Nullable Modifier modifier, @Nullable Alignment contentAlignment, boolean propagateMinConstraints, @NotNull Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*  65 */     Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(1781813501); ComposerKt.sourceInformation($composer, "C(BoxWithConstraints)P(2,1,3)66@3288L218,66@3261L245:BoxWithConstraints.kt#2w3rfo"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x6; } else if (($changed & 0x6) == 0) { $dirty |= $composer.changed(modifier) ? 4 : 2; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changed(contentAlignment) ? 32 : 16; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changed(propagateMinConstraints) ? 256 : 128; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changedInstance(content) ? 2048 : 1024; }  if (($dirty & 0x493) != 1170 || !$composer.getSkipping()) { if ((paramInt1 & 0x1) != 0) {
/*     */         modifier = (Modifier)Modifier.Companion;
/*     */       }
/*     */       if ((paramInt1 & 0x2) != 0) {
/*     */         contentAlignment = Alignment.Companion.getTopStart();
/*     */       } }
/*     */     
/*  72 */     $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new BoxWithConstraintsKt$BoxWithConstraints$2(modifier, contentAlignment, propagateMinConstraints, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"})
/*     */   @SourceDebugExtension({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt$BoxWithConstraints$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/*     */   static final class BoxWithConstraintsKt$BoxWithConstraints$1$1
/*     */     extends Lambda
/*     */     implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult>
/*     */   {
/*     */     @NotNull
/*     */     public final MeasureResult invoke-0kLqBqw(@NotNull SubcomposeMeasureScope $this$SubcomposeLayout, long constraints) {
/*     */       Intrinsics.checkNotNullParameter($this$SubcomposeLayout, "$this$SubcomposeLayout");
/*     */       BoxWithConstraintsScopeImpl scope = new BoxWithConstraintsScopeImpl((Density)$this$SubcomposeLayout, constraints, null);
/*     */       List measurables = $this$SubcomposeLayout.subcompose(Unit.INSTANCE, (Function2)ComposableLambdaKt.composableLambdaInstance(-1945019079, true, new BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(this.$content, scope)));
/*     */       MeasurePolicy $this$invoke_0kLqBqw_u24lambda_u240 = this.$measurePolicy;
/* 125 */       int $i$a$-with-BoxWithConstraintsKt$BoxWithConstraints$1$1$1 = 0;
/*     */       return $this$invoke_0kLqBqw_u24lambda_u240.measure-3p2s80s((MeasureScope)$this$SubcomposeLayout, measurables, constraints);
/*     */     }
/*     */     
/*     */     BoxWithConstraintsKt$BoxWithConstraints$1$1(MeasurePolicy $measurePolicy, Function3<BoxWithConstraintsScope, Composer, Integer, Unit> $content) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\002\020\000\032\0020\001H\013¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"})
/*     */     static final class BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */       BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(Function3<BoxWithConstraintsScope, Composer, Integer, Unit> $content, BoxWithConstraintsScopeImpl $scope) {
/*     */         super(2);
/*     */       }
/*     */       
/*     */       @Composable
/*     */       public final void invoke(@Nullable Composer $composer, int $changed) {
/*     */         ComposerKt.sourceInformation($composer, "C68@3423L9:BoxWithConstraints.kt#2w3rfo");
/*     */         if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */           if (ComposerKt.isTraceInProgress())
/*     */             ComposerKt.traceEventStart(-1945019079, $changed, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)"); 
/*     */           this.$content.invoke(this.$scope, $composer, Integer.valueOf(0));
/*     */           if (ComposerKt.isTraceInProgress())
/*     */             ComposerKt.traceEventEnd(); 
/*     */         } else {
/*     */           $composer.skipToGroupEnd();
/*     */         } 
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class BoxWithConstraintsKt$BoxWithConstraints$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     BoxWithConstraintsKt$BoxWithConstraints$2(Modifier $modifier, Alignment $contentAlignment, boolean $propagateMinConstraints, Function3<BoxWithConstraintsScope, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       BoxWithConstraintsKt.BoxWithConstraints(this.$modifier, this.$contentAlignment, this.$propagateMinConstraints, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\BoxWithConstraintsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */