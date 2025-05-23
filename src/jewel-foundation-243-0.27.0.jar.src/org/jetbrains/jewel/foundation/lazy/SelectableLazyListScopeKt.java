/*     */ package org.jetbrains.jewel.foundation.lazy;
/*     */ 
/*     */ import androidx.compose.foundation.lazy.LazyItemScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.functions.Function5;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000R\n\000\n\002\020\002\n\000\n\002\020\000\n\002\030\002\n\002\020 \n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\032Ë\001\020\000\032\0020\001\"\b\b\000\020\002*\0020\003*\0020\0042\f\020\000\032\b\022\004\022\002H\0020\0052#\b\002\020\006\032\035\022\023\022\021H\002¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\004\022\0020\0030\0072%\b\002\020\013\032\037\022\023\022\021H\002¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\006\022\004\030\0010\0030\0072#\b\002\020\f\032\035\022\023\022\021H\002¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\004\022\0020\r0\00721\020\016\032-\022\004\022\0020\020\022\023\022\021H\002¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\004\022\0020\0010\017¢\006\002\b\021¢\006\002\b\022¢\006\002\020\023\032\002\020\024\032\0020\001\"\b\b\000\020\002*\0020\003*\0020\0042\f\020\000\032\b\022\004\022\002H\0020\00528\b\002\020\006\0322\022\023\022\0210\025¢\006\f\b\b\022\b\b\t\022\004\b\b(\026\022\023\022\021H\002¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\004\022\0020\0030\0172:\b\002\020\013\0324\022\023\022\0210\025¢\006\f\b\b\022\b\b\t\022\004\b\b(\026\022\023\022\021H\002¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\006\022\004\030\0010\0030\01728\b\002\020\f\0322\022\023\022\0210\025¢\006\f\b\b\022\b\b\t\022\004\b\b(\026\022\023\022\021H\002¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\004\022\0020\r0\0172F\020\016\032B\022\004\022\0020\020\022\023\022\0210\025¢\006\f\b\b\022\b\b\t\022\004\b\b(\026\022\023\022\021H\002¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\004\022\0020\0010\027¢\006\002\b\021¢\006\002\b\022¢\006\002\020\030\032%\020\031\032\0020\020*\0020\0322\b\b\002\020\033\032\0020\r2\b\b\002\020\034\032\0020\rH\007¢\006\002\020\035¨\006\036"}, d2 = {"items", "", "T", "", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScope;", "", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "contentType", "selectable", "", "itemContent", "Lkotlin/Function2;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "(Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "SelectableLazyItemScope", "Landroidx/compose/foundation/lazy/LazyItemScope;", "isSelected", "isActive", "(Landroidx/compose/foundation/lazy/LazyItemScope;ZZLandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;", "foundation"})
/*     */ public final class SelectableLazyListScopeKt
/*     */ {
/*     */   private static final Object items$lambda$0(Object it) {
/* 157 */     Intrinsics.checkNotNullParameter(it, "it"); return it;
/* 158 */   } private static final Object items$lambda$1(Object it) { Intrinsics.checkNotNullParameter(it, "it"); return it; } private static final boolean items$lambda$2(Object it) {
/* 159 */     Intrinsics.checkNotNullParameter(it, "it"); return true;
/*     */   } @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final <T> void items(@NotNull SelectableLazyListScope $this$items, @NotNull List items, @NotNull Function1 key, @NotNull Function1 contentType, @NotNull Function1 selectable, @NotNull Function4 itemContent) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'items'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 'key'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_3
/*     */     //   19: ldc 'contentType'
/*     */     //   21: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   24: aload #4
/*     */     //   26: ldc 'selectable'
/*     */     //   28: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   31: aload #5
/*     */     //   33: ldc 'itemContent'
/*     */     //   35: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   38: aload_0
/*     */     //   39: aload_1
/*     */     //   40: invokeinterface size : ()I
/*     */     //   45: aload_2
/*     */     //   46: aload_1
/*     */     //   47: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/jvm/functions/Function1;
/*     */     //   52: aload_3
/*     */     //   53: aload_1
/*     */     //   54: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/jvm/functions/Function1;
/*     */     //   59: aload #4
/*     */     //   61: aload_1
/*     */     //   62: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/jvm/functions/Function1;
/*     */     //   67: ldc 990139457
/*     */     //   69: iconst_1
/*     */     //   70: new org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeKt$items$7
/*     */     //   73: dup
/*     */     //   74: aload #5
/*     */     //   76: aload_1
/*     */     //   77: invokespecial <init> : (Lkotlin/jvm/functions/Function4;Ljava/util/List;)V
/*     */     //   80: invokestatic composableLambdaInstance : (IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   83: checkcast kotlin/jvm/functions/Function4
/*     */     //   86: invokeinterface items : (ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V
/*     */     //   91: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #162	-> 38
/*     */     //   #163	-> 39
/*     */     //   #162	-> 45
/*     */     //   #167	-> 67
/*     */     //   #162	-> 86
/*     */     //   #169	-> 91
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	92	0	$this$items	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScope;
/*     */     //   0	92	1	items	Ljava/util/List;
/*     */     //   0	92	2	key	Lkotlin/jvm/functions/Function1;
/*     */     //   0	92	3	contentType	Lkotlin/jvm/functions/Function1;
/*     */     //   0	92	4	selectable	Lkotlin/jvm/functions/Function1;
/*     */     //   0	92	5	itemContent	Lkotlin/jvm/functions/Function4;
/*     */   }
/* 164 */   private static final Object items$lambda$3(Function1 $key, List $items, int it) { return $key.invoke($items.get(it)); }
/* 165 */   private static final Object items$lambda$4(Function1 $contentType, List $items, int it) { return $contentType.invoke($items.get(it)); }
/* 166 */   private static final boolean items$lambda$5(Function1 $selectable, List $items, int it) { return ((Boolean)$selectable.invoke($items.get(it))).booleanValue(); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class SelectableLazyListScopeKt$items$7 implements Function4<SelectableLazyItemScope, Integer, Composer, Integer, Unit> { @Composable
/* 167 */     public final void invoke(SelectableLazyItemScope $this$items, int it, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$items, "$this$items"); int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= $composer.changed($this$items) ? 4 : 2;  if (($changed & 0x30) == 0) $dirty |= $composer.changed(it) ? 32 : 16;  if (($dirty & 0x93) != 146 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(990139457, $dirty, -1, "org.jetbrains.jewel.foundation.lazy.items.<anonymous> (SelectableLazyListScope.kt:166)");  this.$itemContent.invoke($this$items, this.$items.get(it), $composer, Integer.valueOf(0xE & $dirty)); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */        }
/*     */     
/*     */     SelectableLazyListScopeKt$items$7(Function4<SelectableLazyItemScope, T, Composer, Integer, Unit> $itemContent, List<T> $items) {} }
/*     */   
/*     */   private static final Object itemsIndexed$lambda$6(int paramInt, Object item) {
/* 173 */     Intrinsics.checkNotNullParameter(item, "item"); return item;
/* 174 */   } private static final Object itemsIndexed$lambda$7(int paramInt, Object item) { Intrinsics.checkNotNullParameter(item, "item"); return item; } private static final boolean itemsIndexed$lambda$8(int paramInt, Object paramObject) {
/* 175 */     Intrinsics.checkNotNullParameter(paramObject, "<unused var>"); return true;
/*     */   } @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final <T> void itemsIndexed(@NotNull SelectableLazyListScope $this$itemsIndexed, @NotNull List items, @NotNull Function2 key, @NotNull Function2 contentType, @NotNull Function2 selectable, @NotNull Function5 itemContent) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'items'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 'key'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_3
/*     */     //   19: ldc 'contentType'
/*     */     //   21: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   24: aload #4
/*     */     //   26: ldc 'selectable'
/*     */     //   28: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   31: aload #5
/*     */     //   33: ldc 'itemContent'
/*     */     //   35: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   38: aload_0
/*     */     //   39: aload_1
/*     */     //   40: invokeinterface size : ()I
/*     */     //   45: aload_2
/*     */     //   46: aload_1
/*     */     //   47: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Ljava/util/List;)Lkotlin/jvm/functions/Function1;
/*     */     //   52: aload_3
/*     */     //   53: aload_1
/*     */     //   54: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Ljava/util/List;)Lkotlin/jvm/functions/Function1;
/*     */     //   59: aload #4
/*     */     //   61: aload_1
/*     */     //   62: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Ljava/util/List;)Lkotlin/jvm/functions/Function1;
/*     */     //   67: ldc -1893450136
/*     */     //   69: iconst_1
/*     */     //   70: new org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeKt$itemsIndexed$7
/*     */     //   73: dup
/*     */     //   74: aload #5
/*     */     //   76: aload_1
/*     */     //   77: invokespecial <init> : (Lkotlin/jvm/functions/Function5;Ljava/util/List;)V
/*     */     //   80: invokestatic composableLambdaInstance : (IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   83: checkcast kotlin/jvm/functions/Function4
/*     */     //   86: invokeinterface items : (ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V
/*     */     //   91: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #178	-> 38
/*     */     //   #179	-> 39
/*     */     //   #178	-> 45
/*     */     //   #183	-> 67
/*     */     //   #178	-> 86
/*     */     //   #185	-> 91
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	92	0	$this$itemsIndexed	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScope;
/*     */     //   0	92	1	items	Ljava/util/List;
/*     */     //   0	92	2	key	Lkotlin/jvm/functions/Function2;
/*     */     //   0	92	3	contentType	Lkotlin/jvm/functions/Function2;
/*     */     //   0	92	4	selectable	Lkotlin/jvm/functions/Function2;
/*     */     //   0	92	5	itemContent	Lkotlin/jvm/functions/Function5;
/*     */   }
/* 180 */   private static final Object itemsIndexed$lambda$9(Function2 $key, List $items, int it) { return $key.invoke(Integer.valueOf(it), $items.get(it)); }
/* 181 */   private static final Object itemsIndexed$lambda$10(Function2 $contentType, List $items, int it) { return $contentType.invoke(Integer.valueOf(it), $items.get(it)); }
/* 182 */   private static final boolean itemsIndexed$lambda$11(Function2 $selectable, List $items, int it) { return ((Boolean)$selectable.invoke(Integer.valueOf(it), $items.get(it))).booleanValue(); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class SelectableLazyListScopeKt$itemsIndexed$7 implements Function4<SelectableLazyItemScope, Integer, Composer, Integer, Unit> { SelectableLazyListScopeKt$itemsIndexed$7(Function5<SelectableLazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent, List<T> $items) {} @Composable
/* 183 */     public final void invoke(SelectableLazyItemScope $this$items, int it, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$items, "$this$items"); int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= $composer.changed($this$items) ? 4 : 2;  if (($changed & 0x30) == 0) $dirty |= $composer.changed(it) ? 32 : 16;  if (($dirty & 0x93) != 146 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1893450136, $dirty, -1, "org.jetbrains.jewel.foundation.lazy.itemsIndexed.<anonymous> (SelectableLazyListScope.kt:182)");  this.$itemContent.invoke($this$items, Integer.valueOf(it), this.$items.get(it), $composer, Integer.valueOf(0xE & $dirty | 0x70 & $dirty)); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */        }
/*     */      }
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final SelectableLazyItemScope SelectableLazyItemScope(@NotNull LazyItemScope $this$SelectableLazyItemScope, boolean isSelected, boolean isActive, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 189 */     Intrinsics.checkNotNullParameter($this$SelectableLazyItemScope, "<this>"); $composer.startReplaceGroup(1694613489); if ((paramInt1 & 0x1) != 0) isSelected = false;  if ((paramInt1 & 0x2) != 0)
/* 190 */       isActive = false;  if (ComposerKt.isTraceInProgress())
/* 191 */       ComposerKt.traceEventStart(1694613489, $changed, -1, "org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope (SelectableLazyListScope.kt:190)");  SelectableLazyItemScopeDelegate selectableLazyItemScopeDelegate = new SelectableLazyItemScopeDelegate($this$SelectableLazyItemScope, isSelected, isActive); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return selectableLazyItemScopeDelegate;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyListScopeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */