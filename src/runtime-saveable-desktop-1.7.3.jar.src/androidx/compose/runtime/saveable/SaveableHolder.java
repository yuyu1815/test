/*     */ package androidx.compose.runtime.saveable;
/*     */ 
/*     */ import androidx.compose.runtime.RememberObserver;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\021\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\005\b\002\030\000*\004\b\000\020\0012\0020\0022\0020\003BE\022\022\020\004\032\016\022\004\022\0028\000\022\004\022\0020\0060\005\022\b\020\007\032\004\030\0010\b\022\006\020\t\032\0020\n\022\006\020\013\032\0028\000\022\020\020\f\032\f\022\b\b\001\022\004\030\0010\0060\r¢\006\002\020\016J\020\020\025\032\0020\0262\006\020\013\032\0020\006H\026J\037\020\027\032\004\030\0018\0002\020\020\f\032\f\022\b\b\001\022\004\030\0010\0060\r¢\006\002\020\030J\b\020\031\032\0020\032H\026J\b\020\033\032\0020\032H\026J\b\020\034\032\0020\032H\026J\b\020\035\032\0020\032H\002JK\020\036\032\0020\0322\022\020\004\032\016\022\004\022\0028\000\022\004\022\0020\0060\0052\b\020\007\032\004\030\0010\b2\006\020\t\032\0020\n2\006\020\013\032\0028\0002\020\020\f\032\f\022\b\b\001\022\004\030\0010\0060\r¢\006\002\020\016R\020\020\017\032\004\030\0010\020X\016¢\006\002\n\000R\032\020\f\032\f\022\b\b\001\022\004\030\0010\0060\rX\016¢\006\004\n\002\020\021R\016\020\t\032\0020\nX\016¢\006\002\n\000R\020\020\007\032\004\030\0010\bX\016¢\006\002\n\000R\032\020\004\032\016\022\004\022\0028\000\022\004\022\0020\0060\005X\016¢\006\002\n\000R\020\020\013\032\0028\000X\016¢\006\004\n\002\020\022R\026\020\023\032\n\022\006\022\004\030\0010\0060\024X\004¢\006\002\n\000¨\006\037"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableHolder;", "T", "Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/runtime/RememberObserver;", "saver", "Landroidx/compose/runtime/saveable/Saver;", "", "registry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "key", "", "value", "inputs", "", "(Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "entry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "[Ljava/lang/Object;", "Ljava/lang/Object;", "valueProvider", "Lkotlin/Function0;", "canBeSaved", "", "getValueIfInputsDidntChange", "([Ljava/lang/Object;)Ljava/lang/Object;", "onAbandoned", "", "onForgotten", "onRemembered", "register", "update", "runtime-saveable"})
/*     */ @SourceDebugExtension({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
/*     */ final class SaveableHolder<T>
/*     */   implements SaverScope, RememberObserver
/*     */ {
/*     */   @NotNull
/*     */   private Saver<T, Object> saver;
/*     */   @Nullable
/*     */   private SaveableStateRegistry registry;
/*     */   @NotNull
/*     */   private String key;
/*     */   private T value;
/*     */   @NotNull
/*     */   private Object[] inputs;
/*     */   @Nullable
/*     */   private SaveableStateRegistry.Entry entry;
/*     */   @NotNull
/*     */   private final Function0<Object> valueProvider;
/*     */   
/*     */   public SaveableHolder(@NotNull Saver<T, Object> saver, @Nullable SaveableStateRegistry registry, @NotNull String key, Object value, @NotNull Object[] inputs) {
/* 136 */     this.saver = saver;
/* 137 */     this.registry = registry;
/* 138 */     this.key = key;
/* 139 */     this.value = (T)value;
/* 140 */     this.inputs = inputs;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 146 */     this.valueProvider = new SaveableHolder$valueProvider$1(); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\000\n\002\b\002\020\000\032\004\030\0010\001\"\004\b\000\020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "T", "invoke"}) @SourceDebugExtension({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder$valueProvider$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"}) static final class SaveableHolder$valueProvider$1 extends Lambda implements Function0<Object> { @Nullable
/* 147 */     public final Object invoke() { Saver saver1 = SaveableHolder.this.saver; SaveableHolder<T> saveableHolder = SaveableHolder.this; Saver $this$invoke_u24lambda_u241 = saver1; int $i$a$-with-SaveableHolder$valueProvider$1$1 = 0;
/* 148 */       if (saveableHolder.value == null) { saveableHolder.value;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 275 */         Object object = saveableHolder.value; SaveableHolder<T> saveableHolder1 = saveableHolder; int $i$a$-requireNotNull-SaveableHolder$valueProvider$1$1$1 = 0; String str2 = "Value should be initialized", str1 = str2; throw new IllegalArgumentException(str1.toString()); }  return saveableHolder.save((SaverScope)saveableHolder.value, saveableHolder.value); } SaveableHolder$valueProvider$1() { super(0); } } private final void register() { SaveableStateRegistry registry = this.registry; if (!((this.entry == null) ? 1 : 0)) { int $i$a$-require-SaveableHolder$register$1 = 0;
/*     */       String str = "entry(" + this.entry + ") is not null";
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/*     */     if (registry != null) {
/*     */       RememberSaveableKt.access$requireCanBeSaved(registry, this.valueProvider.invoke());
/*     */       this.entry = registry.registerProvider(this.key, this.valueProvider);
/*     */     }  }
/*     */ 
/*     */   
/*     */   public final void update(@NotNull Saver<T, Object> saver, @Nullable SaveableStateRegistry registry, @NotNull String key, Object value, @NotNull Object[] inputs) {
/*     */     Intrinsics.checkNotNullParameter(saver, "saver");
/*     */     Intrinsics.checkNotNullParameter(key, "key");
/*     */     Intrinsics.checkNotNullParameter(inputs, "inputs");
/*     */     boolean entryIsOutdated = false;
/*     */     if (this.registry != registry) {
/*     */       this.registry = registry;
/*     */       entryIsOutdated = true;
/*     */     } 
/*     */     if (!Intrinsics.areEqual(this.key, key)) {
/*     */       this.key = key;
/*     */       entryIsOutdated = true;
/*     */     } 
/*     */     this.saver = saver;
/*     */     this.value = (T)value;
/*     */     this.inputs = inputs;
/*     */     if (this.entry != null && entryIsOutdated) {
/*     */       if (this.entry != null) {
/*     */         this.entry.unregister();
/*     */       } else {
/*     */       
/*     */       } 
/*     */       this.entry = null;
/*     */       register();
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean canBeSaved(@NotNull Object value) {
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     SaveableStateRegistry registry = this.registry;
/*     */     return (registry == null || registry.canBeSaved(value));
/*     */   }
/*     */   
/*     */   public void onRemembered() {
/*     */     register();
/*     */   }
/*     */   
/*     */   public void onForgotten() {
/*     */     if (this.entry != null) {
/*     */       this.entry.unregister();
/*     */     } else {
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   public void onAbandoned() {
/*     */     if (this.entry != null) {
/*     */       this.entry.unregister();
/*     */     } else {
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final T getValueIfInputsDidntChange(@NotNull Object[] inputs) {
/*     */     Intrinsics.checkNotNullParameter(inputs, "inputs");
/*     */     return Arrays.equals(inputs, this.inputs) ? this.value : null;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-saveable-desktop-1.7.3.jar!\androidx\compose\runtime\saveable\SaveableHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */