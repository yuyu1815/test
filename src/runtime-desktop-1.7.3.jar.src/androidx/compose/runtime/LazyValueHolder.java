/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.KotlinNothingValueException;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005J\025\020\013\032\0028\0002\006\020\f\032\0020\rH\026¢\006\002\020\016J\034\020\017\032\b\022\004\022\0028\0000\0202\f\020\021\032\b\022\004\022\0028\0000\022H\026R\033\020\006\032\0028\0008BX\002¢\006\f\n\004\b\t\020\n\032\004\b\007\020\b¨\006\023"}, d2 = {"Landroidx/compose/runtime/LazyValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", "valueProducer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "current", "getCurrent", "()Ljava/lang/Object;", "current$delegate", "Lkotlin/Lazy;", "readValue", "map", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "toProvided", "Landroidx/compose/runtime/ProvidedValue;", "local", "Landroidx/compose/runtime/CompositionLocal;", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class LazyValueHolder<T>
/*    */   implements ValueHolder<T>
/*    */ {
/*    */   @NotNull
/*    */   private final Lazy current$delegate;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public LazyValueHolder(@NotNull Function0 valueProducer) {
/* 46 */     this.current$delegate = LazyKt.lazy(valueProducer); } private final T getCurrent() { Lazy lazy = this.current$delegate; return (T)lazy.getValue(); }
/*    */   
/* 48 */   public T readValue(@NotNull PersistentCompositionLocalMap map) { Intrinsics.checkNotNullParameter(map, "map"); return getCurrent(); } @NotNull
/*    */   public ProvidedValue<T> toProvided(@NotNull CompositionLocal local) {
/* 50 */     Intrinsics.checkNotNullParameter(local, "local"); ComposerKt.composeRuntimeError("Cannot produce a provider from a lazy value holder"); throw new KotlinNothingValueException();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\LazyValueHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */