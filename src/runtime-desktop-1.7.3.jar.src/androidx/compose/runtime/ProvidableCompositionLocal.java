/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b'\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\025\b\000\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005J\035\020\006\032\b\022\004\022\0028\0000\0072\006\020\b\032\0028\000H ¢\006\004\b\t\020\nJ\034\020\013\032\b\022\004\022\0028\0000\0072\006\020\b\032\0028\000H\004¢\006\002\020\nJ(\020\f\032\b\022\004\022\0028\0000\0072\027\020\r\032\023\022\004\022\0020\017\022\004\022\0028\0000\016¢\006\002\b\020H\004J\034\020\021\032\b\022\004\022\0028\0000\0072\006\020\b\032\0028\000H\004¢\006\002\020\nJ1\020\022\032\b\022\004\022\0028\0000\0232\f\020\b\032\b\022\004\022\0028\0000\0072\016\020\024\032\n\022\004\022\0028\000\030\0010\023H\020¢\006\002\b\025J\034\020\026\032\b\022\004\022\0028\0000\0232\f\020\b\032\b\022\004\022\0028\0000\007H\002¨\006\027"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/CompositionLocal;", "defaultFactory", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "defaultProvidedValue", "Landroidx/compose/runtime/ProvidedValue;", "value", "defaultProvidedValue$runtime", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "provides", "providesComputed", "compute", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "providesDefault", "updatedStateOf", "Landroidx/compose/runtime/ValueHolder;", "previous", "updatedStateOf$runtime", "valueHolderOf", "runtime"})
/*     */ @Stable
/*     */ public abstract class ProvidableCompositionLocal<T>
/*     */   extends CompositionLocal<T>
/*     */ {
/*     */   public static final int $stable;
/*     */   
/*     */   public ProvidableCompositionLocal(@NotNull Function0 defaultFactory) {
/*  90 */     super(defaultFactory, null);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public abstract ProvidedValue<T> defaultProvidedValue$runtime(T paramT);
/*     */   
/*     */   @NotNull
/*     */   public final ProvidedValue<T> provides(Object value) {
/*  99 */     return defaultProvidedValue$runtime((T)value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ProvidedValue<T> providesDefault(Object value) {
/* 108 */     return defaultProvidedValue$runtime((T)value).ifNotAlreadyProvided$runtime();
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
/*     */   @NotNull
/*     */   public final ProvidedValue<T> providesComputed(@NotNull Function1<? super CompositionLocalAccessorScope, ? extends T> compute) {
/* 133 */     Intrinsics.checkNotNullParameter(compute, "compute"); return new ProvidedValue<>(
/* 134 */         this, 
/* 135 */         null, 
/* 136 */         false, 
/* 137 */         null, 
/* 138 */         null, 
/* 139 */         compute, 
/* 140 */         false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public ValueHolder<T> updatedStateOf$runtime(@NotNull ProvidedValue<T> value, @Nullable ValueHolder previous) {
/* 147 */     Intrinsics.checkNotNullParameter(value, "value"); ValueHolder valueHolder = previous;
/*     */ 
/*     */     
/* 150 */     ((DynamicValueHolder)previous).getState().setValue(value.getEffectiveValue$runtime());
/* 151 */     if (((valueHolder instanceof DynamicValueHolder) ? (value.isDynamic$runtime() ? previous : 
/* 152 */       null) : (
/* 153 */       (valueHolder instanceof StaticValueHolder) ? (
/* 154 */       (value.isStatic$runtime() && Intrinsics.areEqual(value.getEffectiveValue$runtime(), ((StaticValueHolder)previous).getValue())) ? 
/* 155 */       previous : 
/* 156 */       null) : (
/* 157 */       (valueHolder instanceof ComputedValueHolder) ? (
/* 158 */       (value.getCompute$runtime() == ((ComputedValueHolder<T>)previous).getCompute()) ? 
/* 159 */       previous : 
/* 160 */       null) : 
/* 161 */       null))) == null) (valueHolder instanceof DynamicValueHolder) ? (value.isDynamic$runtime() ? previous : null) : ((valueHolder instanceof StaticValueHolder) ? ((value.isStatic$runtime() && Intrinsics.areEqual(value.getEffectiveValue$runtime(), ((StaticValueHolder)previous).getValue())) ? previous : null) : ((valueHolder instanceof ComputedValueHolder) ? ((value.getCompute$runtime() == ((ComputedValueHolder<T>)previous).getCompute()) ? previous : null) : null)); 
/* 162 */     return valueHolderOf(value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final ValueHolder<T> valueHolderOf(ProvidedValue<? extends T> value) {
/* 169 */     if (value.getState$runtime() == null) { value.getState$runtime();
/* 170 */       if (value.getMutationPolicy$runtime() == null) value.getMutationPolicy$runtime();
/*     */        }
/*     */     
/*     */     super(value.getState$runtime());
/* 174 */     return value.isDynamic$runtime() ? new DynamicValueHolder<>() : ((value.getCompute$runtime() != null) ? new ComputedValueHolder<>(value.getCompute$runtime()) : (
/* 175 */       (value.getState$runtime() != null) ? new DynamicValueHolder<>((MutableState)value.getState$runtime()) : 
/* 176 */       new StaticValueHolder<>(value.getEffectiveValue$runtime())));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ProvidableCompositionLocal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */