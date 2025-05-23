/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmName;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b7\030\000*\004\b\000\020\0012\0020\002B\025\b\004\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005J1\020\017\032\b\022\004\022\0028\0000\f2\f\020\020\032\b\022\004\022\0028\0000\0212\016\020\022\032\n\022\004\022\0028\000\030\0010\fH ¢\006\002\b\023R\030\020\006\032\0028\0008Ç\002¢\006\f\022\004\b\007\020\b\032\004\b\t\020\nR\032\020\013\032\b\022\004\022\0028\0000\fX\004¢\006\b\n\000\032\004\b\r\020\016\001\001\024¨\006\025"}, d2 = {"Landroidx/compose/runtime/CompositionLocal;", "T", "", "defaultFactory", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "current", "getCurrent$annotations", "()V", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "defaultValueHolder", "Landroidx/compose/runtime/ValueHolder;", "getDefaultValueHolder$runtime", "()Landroidx/compose/runtime/ValueHolder;", "updatedStateOf", "value", "Landroidx/compose/runtime/ProvidedValue;", "previous", "updatedStateOf$runtime", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime"})
/*    */ @Stable
/*    */ public abstract class CompositionLocal<T>
/*    */ {
/*    */   @NotNull
/*    */   private final ValueHolder<T> defaultValueHolder;
/*    */   public static final int $stable;
/*    */   
/*    */   private CompositionLocal(Function0<? extends T> defaultFactory) {
/* 60 */     this.defaultValueHolder = new LazyValueHolder<>(defaultFactory); } @NotNull public ValueHolder<T> getDefaultValueHolder$runtime() { return this.defaultValueHolder; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public abstract ValueHolder<T> updatedStateOf$runtime(@NotNull ProvidedValue<T> paramProvidedValue, @Nullable ValueHolder<T> paramValueHolder);
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ReadOnlyComposable
/*    */   @Composable
/*    */   @JvmName(name = "getCurrent")
/*    */   public final T getCurrent(@Nullable Composer $composer, int $changed) {
/* 77 */     int $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); T t = (T)$composer.consume(this); ComposerKt.sourceInformationMarkerEnd($composer); return t;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\CompositionLocal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */