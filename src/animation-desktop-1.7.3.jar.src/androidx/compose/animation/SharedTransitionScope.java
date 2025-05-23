/*      */ package androidx.compose.animation;
/*      */ 
/*      */ import androidx.compose.runtime.Composable;
/*      */ import androidx.compose.runtime.Composer;
/*      */ import androidx.compose.runtime.MutableState;
/*      */ import androidx.compose.runtime.SnapshotStateKt;
/*      */ import androidx.compose.runtime.Stable;
/*      */ import androidx.compose.runtime.State;
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import androidx.compose.ui.Alignment;
/*      */ import androidx.compose.ui.Modifier;
/*      */ import androidx.compose.ui.geometry.Rect;
/*      */ import androidx.compose.ui.graphics.Path;
/*      */ import androidx.compose.ui.graphics.Shape;
/*      */ import androidx.compose.ui.layout.ContentScale;
/*      */ import androidx.compose.ui.layout.LookaheadScope;
/*      */ import androidx.compose.ui.unit.Density;
/*      */ import androidx.compose.ui.unit.LayoutDirection;
/*      */ import kotlin.Deprecated;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.reflect.KProperty;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\bg\030\0002\0020\001:\004\005345J\020\020\005\032\0020\0062\006\020\007\032\0020\bH&J\025\020\t\032\0020\n2\006\020\013\032\0020\fH'¢\006\002\020\rJ\034\020\016\032\0020\0172\b\b\002\020\020\032\0020\0212\b\b\002\020\022\032\0020\023H\027J\034\020\024\032\0020\0252\b\b\002\020\020\032\0020\0212\b\b\002\020\022\032\0020\023H\027JD\020\026\032\0020\027*\0020\0272\016\b\002\020\030\032\b\022\004\022\0020\0030\0312\b\b\002\020\032\032\0020\0332\034\b\002\020\034\032\026\022\004\022\0020\036\022\004\022\0020\037\022\006\022\004\030\0010 0\035H&Jl\020!\032\0020\027*\0020\0272\006\020\"\032\0020\n2\006\020#\032\0020$2\b\b\002\020%\032\0020\0172\b\b\002\020&\032\0020\0252\b\b\002\020'\032\0020(2\b\b\002\020)\032\0020*2\b\b\002\020+\032\0020,2\b\b\002\020-\032\0020\0032\b\b\002\020\032\032\0020\0332\b\b\002\020\034\032\0020\006H&JN\020.\032\0020\027*\0020\0272\006\020/\032\0020\n2\006\020#\032\0020$2\b\b\002\020'\032\0020(2\b\b\002\020+\032\0020,2\b\b\002\020-\032\0020\0032\b\b\002\020\032\032\0020\0332\b\b\002\020\034\032\0020\006H&JN\0200\032\0020\027*\0020\0272\006\020\"\032\0020\n2\006\0201\032\0020\0032\b\b\002\020'\032\0020(2\b\b\002\020+\032\0020,2\b\b\002\020-\032\0020\0032\b\b\002\020\032\032\0020\0332\b\b\002\020\034\032\0020\006H&J\f\0202\032\0020\027*\0020\027H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\002\020\004ø\001\000\002\006\n\004\b!0\001¨\0066À\006\001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "isTransitionActive", "", "()Z", "OverlayClip", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "rememberSharedContentState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "key", "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "scaleInSharedContentToBounds", "Landroidx/compose/animation/EnterTransition;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alignment", "Landroidx/compose/ui/Alignment;", "scaleOutSharedContentToBounds", "Landroidx/compose/animation/ExitTransition;", "renderInSharedTransitionScopeOverlay", "Landroidx/compose/ui/Modifier;", "renderInOverlay", "Lkotlin/Function0;", "zIndexInOverlay", "", "clipInOverlayDuringTransition", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "sharedBounds", "sharedContentState", "animatedVisibilityScope", "Landroidx/compose/animation/AnimatedVisibilityScope;", "enter", "exit", "boundsTransform", "Landroidx/compose/animation/BoundsTransform;", "resizeMode", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "placeHolderSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "renderInOverlayDuringTransition", "sharedElement", "state", "sharedElementWithCallerManagedVisibility", "visible", "skipToLookaheadSize", "PlaceHolderSize", "ResizeMode", "SharedContentState", "animation"})
/*      */ @Stable
/*      */ @ExperimentalSharedTransitionApi
/*      */ public interface SharedTransitionScope
/*      */   extends LookaheadScope
/*      */ {
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\006\bæ\001\030\000 \b2\0020\001:\001\bJ\"\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\005\032\0020\003H&ø\001\000¢\006\004\b\006\020\007ø\001\001\002\r\n\005\b¡\0360\001\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "", "calculateSize", "Landroidx/compose/ui/unit/IntSize;", "contentSize", "animatedSize", "calculateSize-JyjRU_E", "(JJ)J", "Companion", "animation"})
/*      */   public static interface PlaceHolderSize
/*      */   {
/*      */     @NotNull
/*      */     public static final Companion Companion = Companion.$$INSTANCE;
/*      */     
/*      */     long calculateSize-JyjRU_E(long param1Long1, long param1Long2);
/*      */     
/*      */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize$Companion;", "", "()V", "animatedSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "getAnimatedSize", "()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "contentSize", "getContentSize", "animation"})
/*      */     public static final class Companion
/*      */     {
/*      */       @NotNull
/*  223 */       private static final SharedTransitionScope.PlaceHolderSize animatedSize = SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1.INSTANCE; @NotNull public final SharedTransitionScope.PlaceHolderSize getAnimatedSize() { return animatedSize; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\004\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "<anonymous parameter 0>", "animatedSize", "calculateSize-JyjRU_E", "(JJ)J"}) static final class SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1 implements SharedTransitionScope.PlaceHolderSize { public static final SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1 INSTANCE = new SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1(); public final long calculateSize-JyjRU_E(long param3Long1, long animatedSize) { return animatedSize; }
/*      */          }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       @NotNull
/*  240 */       private static final SharedTransitionScope.PlaceHolderSize contentSize = SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1.INSTANCE; @NotNull public final SharedTransitionScope.PlaceHolderSize getContentSize() { return contentSize; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\004\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "contentSize", "<anonymous parameter 1>", "calculateSize-JyjRU_E", "(JJ)J"}) static final class SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1 implements SharedTransitionScope.PlaceHolderSize { public static final SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1 INSTANCE = new SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1(); public final long calculateSize-JyjRU_E(long contentSize, long param3Long1) { return contentSize; } } } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize$Companion;", "", "()V", "animatedSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "getAnimatedSize", "()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "contentSize", "getContentSize", "animation"}) public static final class Companion { @NotNull private static final SharedTransitionScope.PlaceHolderSize animatedSize = SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1.INSTANCE; @NotNull private static final SharedTransitionScope.PlaceHolderSize contentSize = SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1.INSTANCE; @NotNull public final SharedTransitionScope.PlaceHolderSize getAnimatedSize() { return animatedSize; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\004\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "<anonymous parameter 0>", "animatedSize", "calculateSize-JyjRU_E", "(JJ)J"}) static final class SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1 implements SharedTransitionScope.PlaceHolderSize { public static final SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1 INSTANCE = new SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1(); public final long calculateSize-JyjRU_E(long param3Long1, long animatedSize) { return animatedSize; } } @NotNull public final SharedTransitionScope.PlaceHolderSize getContentSize() { return contentSize; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\004\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "contentSize", "<anonymous parameter 1>", "calculateSize-JyjRU_E", "(JJ)J"}) static final class SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1 implements SharedTransitionScope.PlaceHolderSize { public static final SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1 INSTANCE = new SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1(); public final long calculateSize-JyjRU_E(long contentSize, long param3Long1) { return contentSize; }
/*      */        }
/*      */      }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\000\bv\030\000 \0022\0020\001:\001\002\001\002\003\004ø\001\000\002\006\n\004\b!0\001¨\006\005À\006\001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "", "Companion", "Landroidx/compose/animation/RemeasureImpl;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "animation"})
/*      */   public static interface ResizeMode
/*      */   {
/*      */     @NotNull
/*      */     public static final Companion Companion = Companion.$$INSTANCE;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\007\032\0020\0042\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\f"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$ResizeMode$Companion;", "", "()V", "RemeasureToBounds", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "getRemeasureToBounds", "()Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "ScaleToBounds", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alignment", "Landroidx/compose/ui/Alignment;", "animation"})
/*      */     public static final class Companion
/*      */     {
/*      */       @NotNull
/*  287 */       private static final SharedTransitionScope.ResizeMode RemeasureToBounds = RemeasureImpl.INSTANCE; @NotNull public final SharedTransitionScope.ResizeMode getRemeasureToBounds() { return RemeasureToBounds; }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       @NotNull
/*      */       public final SharedTransitionScope.ResizeMode ScaleToBounds(@NotNull ContentScale contentScale, @NotNull Alignment alignment)
/*      */       {
/*  308 */         Intrinsics.checkNotNullParameter(contentScale, "contentScale"); Intrinsics.checkNotNullParameter(alignment, "alignment"); return SharedTransitionScopeKt.access$ScaleToBoundsCached(contentScale, alignment); } } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\007\032\0020\0042\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\f"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$ResizeMode$Companion;", "", "()V", "RemeasureToBounds", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "getRemeasureToBounds", "()Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "ScaleToBounds", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alignment", "Landroidx/compose/ui/Alignment;", "animation"}) public static final class Companion { @NotNull private static final SharedTransitionScope.ResizeMode RemeasureToBounds = RemeasureImpl.INSTANCE; @NotNull public final SharedTransitionScope.ResizeMode getRemeasureToBounds() { return RemeasureToBounds; } @NotNull public final SharedTransitionScope.ResizeMode ScaleToBounds(@NotNull ContentScale contentScale, @NotNull Alignment alignment) { Intrinsics.checkNotNullParameter(contentScale, "contentScale"); Intrinsics.checkNotNullParameter(alignment, "alignment"); return SharedTransitionScopeKt.access$ScaleToBoundsCached(contentScale, alignment); }
/*      */      }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated(message = "This EnterTransition has been deprecated. Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
/*      */   @NotNull
/*      */   default EnterTransition scaleInSharedContentToBounds(@NotNull ContentScale contentScale, @NotNull Alignment alignment) {
/*  326 */     Intrinsics.checkNotNullParameter(contentScale, "contentScale"); Intrinsics.checkNotNullParameter(alignment, "alignment"); return EnterExitTransitionKt.withEffect(EnterTransition.Companion.getNone(), new ContentScaleTransitionEffect(contentScale, alignment));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated(message = "This ExitTransition has been deprecated.  Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
/*      */   @NotNull
/*      */   default ExitTransition scaleOutSharedContentToBounds(@NotNull ContentScale contentScale, @NotNull Alignment alignment) {
/*  336 */     Intrinsics.checkNotNullParameter(contentScale, "contentScale"); Intrinsics.checkNotNullParameter(alignment, "alignment"); return EnterExitTransitionKt.withEffect(ExitTransition.Companion.getNone(), new ContentScaleTransitionEffect(contentScale, alignment));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"})
/*      */   static final class SharedTransitionScope$renderInSharedTransitionScopeOverlay$1
/*      */     extends Lambda
/*      */     implements Function0<Boolean>
/*      */   {
/*      */     SharedTransitionScope$renderInSharedTransitionScopeOverlay$1() {
/*      */       super(0);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public final Boolean invoke() {
/*  374 */       return Boolean.valueOf(SharedTransitionScope.this.isTransitionActive());
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean isTransitionActive();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   Modifier skipToLookaheadSize(@NotNull Modifier paramModifier);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   Modifier renderInSharedTransitionScopeOverlay(@NotNull Modifier paramModifier, @NotNull Function0<Boolean> paramFunction0, float paramFloat, @NotNull Function2<? super LayoutDirection, ? super Density, ? extends Path> paramFunction2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   Modifier sharedElement(@NotNull Modifier paramModifier, @NotNull SharedContentState paramSharedContentState, @NotNull AnimatedVisibilityScope paramAnimatedVisibilityScope, @NotNull BoundsTransform paramBoundsTransform, @NotNull PlaceHolderSize paramPlaceHolderSize, boolean paramBoolean, float paramFloat, @NotNull OverlayClip paramOverlayClip);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   Modifier sharedBounds(@NotNull Modifier paramModifier, @NotNull SharedContentState paramSharedContentState, @NotNull AnimatedVisibilityScope paramAnimatedVisibilityScope, @NotNull EnterTransition paramEnterTransition, @NotNull ExitTransition paramExitTransition, @NotNull BoundsTransform paramBoundsTransform, @NotNull ResizeMode paramResizeMode, @NotNull PlaceHolderSize paramPlaceHolderSize, boolean paramBoolean, float paramFloat, @NotNull OverlayClip paramOverlayClip);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   Modifier sharedElementWithCallerManagedVisibility(@NotNull Modifier paramModifier, @NotNull SharedContentState paramSharedContentState, boolean paramBoolean1, @NotNull BoundsTransform paramBoundsTransform, @NotNull PlaceHolderSize paramPlaceHolderSize, boolean paramBoolean2, float paramFloat, @NotNull OverlayClip paramOverlayClip);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   OverlayClip OverlayClip(@NotNull Shape paramShape);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Composable
/*      */   @NotNull
/*      */   SharedContentState rememberSharedContentState(@NotNull Object paramObject, @Nullable Composer paramComposer, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\t\b\007\030\0002\0020\001B\017\b\000\022\006\020\002\032\0020\001¢\006\002\020\003R\023\020\004\032\004\030\0010\0058F¢\006\006\032\004\b\006\020\007R/\020\n\032\004\030\0010\t2\b\020\b\032\004\030\0010\t8@@@X\002¢\006\022\n\004\b\017\020\020\032\004\b\013\020\f\"\004\b\r\020\016R\021\020\021\032\0020\0228F¢\006\006\032\004\b\021\020\023R\021\020\002\032\0020\001¢\006\b\n\000\032\004\b\024\020\025R\024\020\026\032\0020\t8BX\004¢\006\006\032\004\b\027\020\fR\023\020\030\032\004\030\0010\0008F¢\006\006\032\004\b\031\020\032¨\006\033"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "", "key", "(Ljava/lang/Object;)V", "clipPathInOverlay", "Landroidx/compose/ui/graphics/Path;", "getClipPathInOverlay", "()Landroidx/compose/ui/graphics/Path;", "<set-?>", "Landroidx/compose/animation/SharedElementInternalState;", "internalState", "getInternalState$animation", "()Landroidx/compose/animation/SharedElementInternalState;", "setInternalState$animation", "(Landroidx/compose/animation/SharedElementInternalState;)V", "internalState$delegate", "Landroidx/compose/runtime/MutableState;", "isMatchFound", "", "()Z", "getKey", "()Ljava/lang/Object;", "nonNullInternalState", "getNonNullInternalState", "parentSharedContentState", "getParentSharedContentState", "()Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "animation"})
/*      */   @StabilityInferred(parameters = 0)
/*      */   @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScope$SharedContentState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1337:1\n81#2:1338\n107#2,2:1339\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScope$SharedContentState\n*L\n690#1:1338\n690#1:1339,2\n*E\n"})
/*      */   public static final class SharedContentState
/*      */   {
/*      */     @NotNull
/*      */     private final Object key;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     private final MutableState internalState$delegate;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int $stable = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public final Object getKey() {
/*      */       return this.key;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final boolean isMatchFound() {
/*      */       getInternalState$animation().getSharedElement();
/*      */       return (getInternalState$animation() != null && getInternalState$animation().getSharedElement() != null) ? getInternalState$animation().getSharedElement().getFoundMatch() : false;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public SharedContentState(@NotNull Object key)
/*      */     {
/*  663 */       this.key = key;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  690 */       this.internalState$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null); } @Nullable public final Path getClipPathInOverlay() { return getNonNullInternalState().getClipPathInOverlay$animation(); } @Nullable public final SharedContentState getParentSharedContentState() { getNonNullInternalState().getParentState(); return (getNonNullInternalState().getParentState() != null) ? getNonNullInternalState().getParentState().getUserState() : null; } @Nullable public final SharedElementInternalState getInternalState$animation() { State state = (State)this.internalState$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1338 */         (SharedElementInternalState)state.getValue(); } public final void setInternalState$animation(@Nullable SharedElementInternalState <set-?>) { MutableState mutableState = this.internalState$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 1339 */       mutableState.setValue(<set-?>); }
/*      */ 
/*      */     
/*      */     private final SharedElementInternalState getNonNullInternalState() {
/*      */       if (getInternalState$animation() == null) {
/*      */         getInternalState$animation();
/*      */         int $i$a$-requireNotNull-SharedTransitionScope$SharedContentState$nonNullInternalState$1 = 0;
/*      */         String str = "Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.";
/*      */         throw new IllegalArgumentException(str.toString());
/*      */       } 
/*      */       return getInternalState$animation();
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J*\020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H&ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "", "getClipPath", "Landroidx/compose/ui/graphics/Path;", "state", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "animation"})
/*      */   public static interface OverlayClip {
/*      */     @Nullable
/*      */     Path getClipPath(@NotNull SharedTransitionScope.SharedContentState param1SharedContentState, @NotNull Rect param1Rect, @NotNull LayoutDirection param1LayoutDirection, @NotNull Density param1Density);
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SharedTransitionScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */