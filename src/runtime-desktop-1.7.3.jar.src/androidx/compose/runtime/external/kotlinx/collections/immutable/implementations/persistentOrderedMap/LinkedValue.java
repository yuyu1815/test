/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\020\000\n\002\b\007\n\002\020\013\n\002\b\021\b\000\030\000*\004\b\000\020\0012\0020\002B\017\b\026\022\006\020\003\032\0028\000¢\006\002\020\004B\031\b\026\022\006\020\003\032\0028\000\022\b\020\005\032\004\030\0010\002¢\006\002\020\006B!\022\006\020\003\032\0028\000\022\b\020\005\032\004\030\0010\002\022\b\020\007\032\004\030\0010\002¢\006\002\020\bJ\026\020\024\032\b\022\004\022\0028\0000\0002\b\020\025\032\004\030\0010\002J\026\020\026\032\b\022\004\022\0028\0000\0002\b\020\027\032\004\030\0010\002J\031\020\030\032\b\022\004\022\0028\0000\0002\006\020\031\032\0028\000¢\006\002\020\032R\021\020\t\032\0020\n8F¢\006\006\032\004\b\013\020\fR\021\020\r\032\0020\n8F¢\006\006\032\004\b\016\020\fR\023\020\007\032\004\030\0010\002¢\006\b\n\000\032\004\b\017\020\020R\023\020\005\032\004\030\0010\002¢\006\b\n\000\032\004\b\021\020\020R\023\020\003\032\0028\000¢\006\n\n\002\020\023\032\004\b\022\020\020¨\006\033"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "V", "", "value", "(Ljava/lang/Object;)V", "previous", "(Ljava/lang/Object;Ljava/lang/Object;)V", "next", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "hasNext", "", "getHasNext", "()Z", "hasPrevious", "getHasPrevious", "getNext", "()Ljava/lang/Object;", "getPrevious", "getValue", "Ljava/lang/Object;", "withNext", "newNext", "withPrevious", "newPrevious", "withValue", "newValue", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class LinkedValue<V> {
/*    */   private final V value;
/*    */   @Nullable
/*    */   private final Object previous;
/*    */   
/* 15 */   public LinkedValue(Object value, @Nullable Object previous, @Nullable Object next) { this.value = (V)value; this.previous = previous; this.next = next; } @Nullable private final Object next; public static final int $stable = 8; public final V getValue() { return this.value; } @Nullable public final Object getPrevious() { return this.previous; } @Nullable public final Object getNext() { return this.next; }
/*    */    public LinkedValue(Object value) {
/* 17 */     this((V)value, EndOfChain.INSTANCE, EndOfChain.INSTANCE);
/*    */   }
/* 19 */   public LinkedValue(Object value, @Nullable Object previous) { this((V)value, previous, EndOfChain.INSTANCE); }
/*    */   @NotNull
/* 21 */   public final LinkedValue<V> withValue(Object newValue) { return new LinkedValue((V)newValue, this.previous, this.next); } @NotNull
/* 22 */   public final LinkedValue<V> withPrevious(@Nullable Object newPrevious) { return new LinkedValue(this.value, newPrevious, this.next); } @NotNull
/* 23 */   public final LinkedValue<V> withNext(@Nullable Object newNext) { return new LinkedValue(this.value, this.previous, newNext); }
/*    */   
/* 25 */   public final boolean getHasNext() { return (this.next != EndOfChain.INSTANCE); } public final boolean getHasPrevious() {
/* 26 */     return (this.previous != EndOfChain.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\LinkedValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */