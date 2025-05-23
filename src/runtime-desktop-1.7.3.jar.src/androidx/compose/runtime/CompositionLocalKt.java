/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000J\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\032(\020\000\032\0020\0012\006\020\002\032\0020\0032\021\020\004\032\r\022\004\022\0020\0010\005¢\006\002\b\006H\007¢\006\002\020\007\032,\020\000\032\0020\0012\n\020\b\032\006\022\002\b\0030\t2\021\020\004\032\r\022\004\022\0020\0010\005¢\006\002\b\006H\007¢\006\002\020\n\032<\020\000\032\0020\0012\032\020\013\032\016\022\n\b\001\022\006\022\002\b\0030\t0\f\"\006\022\002\b\0030\t2\021\020\004\032\r\022\004\022\0020\0010\005¢\006\002\b\006H\007¢\006\002\020\r\0320\020\016\032\b\022\004\022\002H\0200\017\"\004\b\000\020\0202\016\b\002\020\021\032\b\022\004\022\002H\0200\0222\f\020\023\032\b\022\004\022\002H\0200\005\032+\020\024\032\b\022\004\022\002H\0200\017\"\004\b\000\020\0202\027\020\025\032\023\022\004\022\0020\027\022\004\022\002H\0200\026¢\006\002\b\030\032 \020\031\032\b\022\004\022\002H\0200\017\"\004\b\000\020\0202\f\020\023\032\b\022\004\022\002H\0200\005¨\006\032"}, d2 = {"CompositionLocalProvider", "", "context", "Landroidx/compose/runtime/CompositionLocalContext;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/CompositionLocalContext;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "value", "Landroidx/compose/runtime/ProvidedValue;", "(Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "values", "", "([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "compositionLocalOf", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "T", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "defaultFactory", "compositionLocalWithComputedDefaultOf", "defaultComputation", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "staticCompositionLocalOf", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,424:1\n125#2:425\n152#2,3:426\n37#3,2:429\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n*L\n420#1:425\n420#1:426,3\n420#1:429,2\n*E\n"})
/*     */ public final class CompositionLocalKt
/*     */ {
/*     */   @NotNull
/*     */   public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(@NotNull SnapshotMutationPolicy<T> policy, @NotNull Function0<? extends T> defaultFactory) {
/* 251 */     Intrinsics.checkNotNullParameter(policy, "policy"); Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory"); return new DynamicProvidableCompositionLocal<>(policy, defaultFactory);
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
/*     */   @NotNull
/*     */   public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(@NotNull Function0<? extends T> defaultFactory) {
/* 280 */     Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory"); return new StaticProvidableCompositionLocal<>(defaultFactory);
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
/*     */   @NotNull
/*     */   public static final <T> ProvidableCompositionLocal<T> compositionLocalWithComputedDefaultOf(@NotNull Function1<? super CompositionLocalAccessorScope, ? extends T> defaultComputation) {
/* 313 */     Intrinsics.checkNotNullParameter(defaultComputation, "defaultComputation"); return new ComputedProvidableCompositionLocal<>(defaultComputation);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void CompositionLocalProvider(@NotNull ProvidedValue[] values, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed) {
/* 378 */     Intrinsics.checkNotNullParameter(values, "values"); Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(-1390796515); ComposerKt.sourceInformation($composer, "C(CompositionLocalProvider)P(1)379@16749L9:CompositionLocal.kt#9igjgp"); int $dirty = $changed; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1390796515, $dirty, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)");  $composer
/* 379 */       .startProviders((ProvidedValue<?>[])values);
/* 380 */     content.invoke($composer, Integer.valueOf(0xE & $dirty >> 3)); $composer
/* 381 */       .endProviders(); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new CompositionLocalKt$CompositionLocalProvider$1((ProvidedValue<?>[])values, content, $changed)); } else { $composer.endRestartGroup(); }
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
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void CompositionLocalProvider(@NotNull ProvidedValue<?> value, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed) {
/* 399 */     Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(-1350970552); ComposerKt.sourceInformation($composer, "C(CompositionLocalProvider)P(1)400@17486L9:CompositionLocal.kt#9igjgp"); int $dirty = $changed; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1350970552, $dirty, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)");  $composer
/* 400 */       .startProvider(value);
/* 401 */     content.invoke($composer, Integer.valueOf(0xE & $dirty >> 3)); $composer
/* 402 */       .endProvider(); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new CompositionLocalKt$CompositionLocalProvider$2(value, content, $changed)); } else { $composer.endRestartGroup(); }
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
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void CompositionLocalProvider(@NotNull CompositionLocalContext context, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed) {
/* 418 */     Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(1853897736); ComposerKt.sourceInformation($composer, "C(CompositionLocalProvider)P(1)418@18128L144:CompositionLocal.kt#9igjgp"); int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= $composer.changed(context) ? 4 : 2;  if (($changed & 0x30) == 0) $dirty |= $composer.changedInstance(content) ? 32 : 16;  if (($dirty & 0x13) != 18 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1853897736, $dirty, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:417)");
/*     */       
/* 420 */       Map $this$map$iv = (Map)context.getCompositionLocals$runtime(); int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 425 */       Map map1 = $this$map$iv; Collection destination$iv$iv = new ArrayList($this$map$iv.size()); int $i$f$mapTo = 0;
/* 426 */       for (Map.Entry item$iv$iv : map1.entrySet()) {
/* 427 */         Map.Entry entry1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-CompositionLocalKt$CompositionLocalProvider$3 = 0; collection.add(((ValueHolder)entry1.getValue()).toProvided((CompositionLocal)entry1.getKey()));
/* 428 */       }  List list = (List)destination$iv$iv; int $i$f$toTypedArray = 0;
/* 429 */       Collection thisCollection$iv = list;
/* 430 */       ProvidedValue[] arrayOfProvidedValue = (ProvidedValue[])thisCollection$iv.toArray((Object[])new ProvidedValue[0]);
/*     */       CompositionLocalProvider((ProvidedValue<?>[])Arrays.<ProvidedValue>copyOf(arrayOfProvidedValue, arrayOfProvidedValue.length), content, $composer, 0x70 & $dirty);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */     
/*     */     if ($composer.endRestartGroup() != null) {
/*     */       $composer.endRestartGroup().updateScope(new CompositionLocalKt$CompositionLocalProvider$4(context, content, $changed));
/*     */     } else {
/*     */       $composer.endRestartGroup();
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class CompositionLocalKt$CompositionLocalProvider$1 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     CompositionLocalKt$CompositionLocalProvider$1(ProvidedValue[] $values, Function2<Composer, Integer, Unit> $content, int $$changed) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[])Arrays.<ProvidedValue>copyOf((ProvidedValue[])this.$values, this.$values.length), this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class CompositionLocalKt$CompositionLocalProvider$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     CompositionLocalKt$CompositionLocalProvider$2(ProvidedValue<?> $value, Function2<Composer, Integer, Unit> $content, int $$changed) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       CompositionLocalKt.CompositionLocalProvider(this.$value, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class CompositionLocalKt$CompositionLocalProvider$4 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     CompositionLocalKt$CompositionLocalProvider$4(CompositionLocalContext $context, Function2<Composer, Integer, Unit> $content, int $$changed) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       CompositionLocalKt.CompositionLocalProvider(this.$context, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\CompositionLocalKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */