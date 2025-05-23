/*    */ package androidx.lifecycle.compose;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.SnapshotStateKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.lifecycle.Lifecycle;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\032\027\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\007¢\006\002\020\004¨\006\005"}, d2 = {"currentStateAsState", "Landroidx/compose/runtime/State;", "Landroidx/lifecycle/Lifecycle$State;", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "lifecycle-runtime-compose"})
/*    */ public final class LifecycleExtKt
/*    */ {
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final State<Lifecycle.State> currentStateAsState(@NotNull Lifecycle $this$currentStateAsState, @Nullable Composer $composer, int $changed) {
/* 32 */     Intrinsics.checkNotNullParameter($this$currentStateAsState, "<this>"); $composer.startReplaceableGroup(-1892357376); ComposerKt.sourceInformation($composer, "C(currentStateAsState)31@1273L16:LifecycleExt.kt#2vxrgp"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1892357376, $changed, -1, "androidx.lifecycle.compose.currentStateAsState (LifecycleExt.kt:31)");  State<Lifecycle.State> state = SnapshotStateKt.collectAsState($this$currentStateAsState.getCurrentStateFlow(), null, $composer, 0, 1); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceableGroup(); return state;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-runtime-compose-desktop-2.8.4.jar!\androidx\lifecycle\compose\LifecycleExtKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */