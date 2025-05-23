/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\006\n\002\020\013\n\002\b\f\b\000\030\0002\0020\001B\007\b\026¢\006\002\020\002B\021\b\026\022\b\020\003\032\004\030\0010\001¢\006\002\020\004B\031\022\b\020\003\032\004\030\0010\001\022\b\020\005\032\004\030\0010\001¢\006\002\020\006J\020\020\020\032\0020\0002\b\020\021\032\004\030\0010\001J\020\020\022\032\0020\0002\b\020\023\032\004\030\0010\001R\021\020\007\032\0020\b8F¢\006\006\032\004\b\t\020\nR\021\020\013\032\0020\b8F¢\006\006\032\004\b\f\020\nR\023\020\005\032\004\030\0010\001¢\006\b\n\000\032\004\b\r\020\016R\023\020\003\032\004\030\0010\001¢\006\b\n\000\032\004\b\017\020\016¨\006\024"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "", "()V", "previous", "(Ljava/lang/Object;)V", "next", "(Ljava/lang/Object;Ljava/lang/Object;)V", "hasNext", "", "getHasNext", "()Z", "hasPrevious", "getHasPrevious", "getNext", "()Ljava/lang/Object;", "getPrevious", "withNext", "newNext", "withPrevious", "newPrevious", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class Links {
/*    */   @Nullable
/*    */   private final Object previous;
/*    */   
/* 13 */   public Links(@Nullable Object previous, @Nullable Object next) { this.previous = previous; this.next = next; } @Nullable private final Object next; public static final int $stable = 8; @Nullable public final Object getPrevious() { return this.previous; } @Nullable public final Object getNext() { return this.next; }
/*    */    public Links() {
/* 15 */     this(EndOfChain.INSTANCE, EndOfChain.INSTANCE);
/*    */   }
/* 17 */   public Links(@Nullable Object previous) { this(previous, EndOfChain.INSTANCE); }
/*    */   @NotNull
/* 19 */   public final Links withNext(@Nullable Object newNext) { return new Links(this.previous, newNext); } @NotNull
/* 20 */   public final Links withPrevious(@Nullable Object newPrevious) { return new Links(newPrevious, this.next); }
/*    */   
/* 22 */   public final boolean getHasNext() { return (this.next != EndOfChain.INSTANCE); } public final boolean getHasPrevious() {
/* 23 */     return (this.previous != EndOfChain.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedSet\Links.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */