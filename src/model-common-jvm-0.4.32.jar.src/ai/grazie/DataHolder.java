/*    */ package ai.grazie;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\013\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\006\b'\030\0002\0020\001:\002\036\037B\005¢\006\002\020\002J\022\020\013\032\0020\f2\n\020\r\032\006\022\002\b\0030\005J\030\020\013\032\0020\f2\016\020\r\032\n\022\002\b\003\022\002\b\0030\016H\007J%\020\017\032\004\030\001H\020\"\b\b\000\020\020*\0020\0012\f\020\r\032\b\022\004\022\002H\0200\005¢\006\002\020\021J7\020\017\032\004\030\001H\022\"\b\b\000\020\020*\0020\001\"\b\b\001\020\022*\0020\0012\022\020\r\032\016\022\004\022\002H\020\022\004\022\002H\0220\016H\007¢\006\002\020\023J1\020\024\032\002H\020\"\b\b\000\020\020*\0020\0012\f\020\r\032\b\022\004\022\002H\0200\0052\f\020\025\032\b\022\004\022\002H\0200\026¢\006\002\020\027JC\020\024\032\002H\022\"\b\b\000\020\020*\0020\001\"\b\b\001\020\022*\0020\0012\022\020\r\032\016\022\004\022\002H\020\022\004\022\002H\0220\0162\f\020\025\032\b\022\004\022\002H\0220\026H\007¢\006\002\020\030J+\020\031\032\0020\032\"\b\b\000\020\020*\0020\0012\f\020\r\032\b\022\004\022\002H\0200\0052\006\020\033\032\002H\020¢\006\002\020\034J=\020\031\032\0020\032\"\b\b\000\020\020*\0020\001\"\b\b\001\020\022*\0020\0012\022\020\r\032\016\022\004\022\002H\020\022\004\022\002H\0220\0162\006\020\033\032\002H\022H\007¢\006\002\020\035R?\020\003\032&\022\b\022\006\022\002\b\0030\005\022\004\022\0020\0010\004j\022\022\b\022\006\022\002\b\0030\005\022\004\022\0020\001`\0068BX\002¢\006\f\n\004\b\t\020\n\032\004\b\007\020\b¨\006 "}, d2 = {"Lai/grazie/DataHolder;", "", "()V", "data", "Ljava/util/HashMap;", "Lai/grazie/DataHolder$Key;", "Lkotlin/collections/HashMap;", "getData", "()Ljava/util/HashMap;", "data$delegate", "Lkotlin/Lazy;", "exists", "", "key", "Lai/grazie/DataHolder$TransformingKey;", "get", "T", "(Lai/grazie/DataHolder$Key;)Ljava/lang/Object;", "O", "(Lai/grazie/DataHolder$TransformingKey;)Ljava/lang/Object;", "getOrPut", "default", "Lkotlin/Function0;", "(Lai/grazie/DataHolder$Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lai/grazie/DataHolder$TransformingKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "put", "", "value", "(Lai/grazie/DataHolder$Key;Ljava/lang/Object;)V", "(Lai/grazie/DataHolder$TransformingKey;Ljava/lang/Object;)V", "Key", "TransformingKey", "model-common"})
/*    */ @SourceDebugExtension({"SMAP\nDataHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataHolder.kt\nai/grazie/DataHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/*    */ public abstract class DataHolder {
/*    */   @NotNull
/*  8 */   private final Lazy data$delegate = LazyKt.lazy(DataHolder$data$2.INSTANCE); private final HashMap<Key<?>, Object> getData() { Lazy lazy = this.data$delegate; return (HashMap<Key<?>, Object>)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\000\020\000\032&\022\b\022\006\022\002\b\0030\002\022\004\022\0020\0030\001j\022\022\b\022\006\022\002\b\0030\002\022\004\022\0020\003`\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "Lai/grazie/DataHolder$Key;", "", "Lkotlin/collections/HashMap;", "invoke"}) static final class DataHolder$data$2 extends Lambda implements Function0<HashMap<Key<?>, Object>> { public static final DataHolder$data$2 INSTANCE = new DataHolder$data$2(); DataHolder$data$2() { super(0); } public final HashMap<DataHolder.Key<?>, Object> invoke() { return new HashMap<>(); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\000\n\002\b\002\b\026\030\000*\b\b\000\020\001*\0020\0022\0020\002B\005¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/DataHolder$Key;", "T", "", "()V", "model-common"})
/*    */   public static class Key<T> {} @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\b\b\026\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\0020\002B;\022\f\020\004\032\b\022\004\022\0028\0000\005\022\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007\022\022\020\b\032\016\022\004\022\0028\001\022\004\022\0028\0000\007¢\006\002\020\tR\027\020\004\032\b\022\004\022\0028\0000\005¢\006\b\n\000\032\004\b\n\020\013R\035\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007¢\006\b\n\000\032\004\b\f\020\rR\035\020\b\032\016\022\004\022\0028\001\022\004\022\0028\0000\007¢\006\b\n\000\032\004\b\016\020\r¨\006\017"}, d2 = {"Lai/grazie/DataHolder$TransformingKey;", "T", "", "O", "key", "Lai/grazie/DataHolder$Key;", "transformFrom", "Lkotlin/Function1;", "transformTo", "(Lai/grazie/DataHolder$Key;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getKey", "()Lai/grazie/DataHolder$Key;", "getTransformFrom", "()Lkotlin/jvm/functions/Function1;", "getTransformTo", "model-common"})
/*    */   public static class TransformingKey<T, O> { @NotNull
/* 11 */     private final DataHolder.Key<T> key; public TransformingKey(@NotNull DataHolder.Key<T> key, @NotNull Function1<T, O> transformFrom, @NotNull Function1<O, T> transformTo) { this.key = key; this.transformFrom = transformFrom; this.transformTo = transformTo; } @NotNull private final Function1<T, O> transformFrom; @NotNull private final Function1<O, T> transformTo; @NotNull public final DataHolder.Key<T> getKey() { return this.key; } @NotNull public final Function1<T, O> getTransformFrom() { return this.transformFrom; } @NotNull public final Function1<O, T> getTransformTo() { return this.transformTo; }
/*    */      } @Nullable
/*    */   public final <T> T get(@NotNull Key key) {
/* 14 */     Intrinsics.checkNotNullParameter(key, "key"); return (T)getData().get(key);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final <T, O> O get(@NotNull TransformingKey<T, O> key) {
/* 19 */     Intrinsics.checkNotNullParameter(key, "key"); Object it = getData().get(key.getKey());
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
/* 59 */     int $i$a$-let-DataHolder$get$1 = 0;
/*    */     getData().get(key.getKey());
/*    */     return (getData().get(key.getKey()) != null) ? (O)key.getTransformFrom().invoke(it) : null;
/*    */   }
/*    */   
/*    */   public final <T> void put(@NotNull Key<?> key, @NotNull Object value) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     getData().put(key, value);
/*    */   }
/*    */   
/*    */   public final <T, O> void put(@NotNull TransformingKey<T, O> key, @NotNull Object value) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     getData().put(key.getKey(), key.getTransformTo().invoke(value));
/*    */   }
/*    */   
/*    */   public final boolean exists(@NotNull Key<?> key) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     return (get(key) != null);
/*    */   }
/*    */   
/*    */   public final boolean exists(@NotNull TransformingKey key) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     return (get(key.getKey()) != null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final <T> T getOrPut(@NotNull Key<?> key, @NotNull Function0 default) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullParameter(default, "default");
/*    */     Object value = get(key);
/*    */     if (value == null)
/*    */       put(key, default.invoke()); 
/*    */     Intrinsics.checkNotNull(get(key));
/*    */     return (T)get(key);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final <T, O> O getOrPut(@NotNull TransformingKey<?, ?> key, @NotNull Function0 default) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullParameter(default, "default");
/*    */     Object value = get(key);
/*    */     if (value == null)
/*    */       put(key, default.invoke()); 
/*    */     Intrinsics.checkNotNull(get(key));
/*    */     return (O)get(key);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-common-jvm-0.4.32.jar!\ai\grazie\DataHolder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */