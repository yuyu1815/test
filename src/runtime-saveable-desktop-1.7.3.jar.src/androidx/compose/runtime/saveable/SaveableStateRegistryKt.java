/*     */ package androidx.compose.runtime.saveable;
/*     */ 
/*     */ import androidx.compose.runtime.CompositionLocalKt;
/*     */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.text.CharsKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020$\n\002\020\016\n\002\020 \n\002\020\000\n\000\n\002\030\002\n\002\020\013\n\000\n\002\020\r\n\000\0328\020\005\032\0020\0022\034\020\006\032\030\022\004\022\0020\b\022\f\022\n\022\006\022\004\030\0010\n0\t\030\0010\0072\022\020\013\032\016\022\004\022\0020\n\022\004\022\0020\r0\f\032\f\020\016\032\0020\r*\0020\017H\002\"\031\020\000\032\n\022\006\022\004\030\0010\0020\001¢\006\b\n\000\032\004\b\003\020\004¨\006\020"}, d2 = {"LocalSaveableStateRegistry", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getLocalSaveableStateRegistry", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "SaveableStateRegistry", "restoredValues", "", "", "", "", "canBeSaved", "Lkotlin/Function1;", "", "fastIsBlank", "", "runtime-saveable"})
/*     */ public final class SaveableStateRegistryKt
/*     */ {
/*     */   @NotNull
/*     */   public static final SaveableStateRegistry SaveableStateRegistry(@Nullable Map<String, ? extends List<? extends Object>> restoredValues, @NotNull Function1<Object, Boolean> canBeSaved) {
/*  86 */     Intrinsics.checkNotNullParameter(canBeSaved, "canBeSaved"); return new SaveableStateRegistryImpl(restoredValues, canBeSaved);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*  91 */   private static final ProvidableCompositionLocal<SaveableStateRegistry> LocalSaveableStateRegistry = CompositionLocalKt.staticCompositionLocalOf(SaveableStateRegistryKt$LocalSaveableStateRegistry$1.INSTANCE); @NotNull public static final ProvidableCompositionLocal<SaveableStateRegistry> getLocalSaveableStateRegistry() { return LocalSaveableStateRegistry; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "invoke"}) static final class SaveableStateRegistryKt$LocalSaveableStateRegistry$1 extends Lambda implements Function0<SaveableStateRegistry> { public static final SaveableStateRegistryKt$LocalSaveableStateRegistry$1 INSTANCE = new SaveableStateRegistryKt$LocalSaveableStateRegistry$1(); @Nullable public final SaveableStateRegistry invoke() { return null; }
/*     */      SaveableStateRegistryKt$LocalSaveableStateRegistry$1() {
/*     */       super(0);
/*     */     } } private static final boolean fastIsBlank(CharSequence $this$fastIsBlank) {
/*  95 */     boolean blank = true;
/*  96 */     for (int i = 0, j = $this$fastIsBlank.length(); i < j; i++) {
/*  97 */       if (!CharsKt.isWhitespace($this$fastIsBlank.charAt(i))) {
/*  98 */         blank = false;
/*     */         break;
/*     */       } 
/*     */     } 
/* 102 */     return blank;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-saveable-desktop-1.7.3.jar!\androidx\compose\runtime\saveable\SaveableStateRegistryKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */