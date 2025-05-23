/*    */ package ai.grazie;
/*    */ 
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\b\b\026\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\0020\002B;\022\f\020\004\032\b\022\004\022\0028\0000\005\022\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007\022\022\020\b\032\016\022\004\022\0028\001\022\004\022\0028\0000\007¢\006\002\020\tR\027\020\004\032\b\022\004\022\0028\0000\005¢\006\b\n\000\032\004\b\n\020\013R\035\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007¢\006\b\n\000\032\004\b\f\020\rR\035\020\b\032\016\022\004\022\0028\001\022\004\022\0028\0000\007¢\006\b\n\000\032\004\b\016\020\r¨\006\017"}, d2 = {"Lai/grazie/DataHolder$TransformingKey;", "T", "", "O", "key", "Lai/grazie/DataHolder$Key;", "transformFrom", "Lkotlin/Function1;", "transformTo", "(Lai/grazie/DataHolder$Key;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getKey", "()Lai/grazie/DataHolder$Key;", "getTransformFrom", "()Lkotlin/jvm/functions/Function1;", "getTransformTo", "model-common"})
/*    */ public class TransformingKey<T, O> {
/*    */   @NotNull
/*    */   private final DataHolder.Key<T> key;
/*    */   
/* 11 */   public TransformingKey(@NotNull DataHolder.Key<T> key, @NotNull Function1<T, O> transformFrom, @NotNull Function1<O, T> transformTo) { this.key = key; this.transformFrom = transformFrom; this.transformTo = transformTo; } @NotNull private final Function1<T, O> transformFrom; @NotNull private final Function1<O, T> transformTo; @NotNull public final DataHolder.Key<T> getKey() { return this.key; } @NotNull public final Function1<T, O> getTransformFrom() { return this.transformFrom; } @NotNull public final Function1<O, T> getTransformTo() { return this.transformTo; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-common-jvm-0.4.32.jar!\ai\grazie\DataHolder$TransformingKey.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */