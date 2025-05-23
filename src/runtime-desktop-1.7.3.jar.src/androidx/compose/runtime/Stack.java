/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.ArrayList;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\000\n\002\020\013\n\002\b\n\n\002\020\021\n\002\b\002\b\000\030\000*\004\b\000\020\0012\0020\002B\005¢\006\002\020\003J\006\020\013\032\0020\fJ\006\020\r\032\0020\016J\006\020\017\032\0020\016J\013\020\020\032\0028\000¢\006\002\020\021J\023\020\020\032\0028\0002\006\020\022\032\0020\b¢\006\002\020\023J\013\020\024\032\0028\000¢\006\002\020\021J\023\020\025\032\0020\0162\006\020\026\032\0028\000¢\006\002\020\027J\021\020\030\032\b\022\004\022\0028\0000\031¢\006\002\020\032R\036\020\004\032\022\022\004\022\0028\0000\005j\b\022\004\022\0028\000`\006X\004¢\006\002\n\000R\021\020\007\032\0020\b8F¢\006\006\032\004\b\t\020\n¨\006\033"}, d2 = {"Landroidx/compose/runtime/Stack;", "T", "", "()V", "backing", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "size", "", "getSize", "()I", "clear", "", "isEmpty", "", "isNotEmpty", "peek", "()Ljava/lang/Object;", "index", "(I)Ljava/lang/Object;", "pop", "push", "value", "(Ljava/lang/Object;)Z", "toArray", "", "()[Ljava/lang/Object;", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class Stack<T>
/*    */ {
/*    */   @NotNull
/* 21 */   private final ArrayList<T> backing = new ArrayList<>(); public static final int $stable = 8;
/*    */   public final int getSize() {
/* 23 */     return this.backing.size();
/*    */   }
/* 25 */   public final boolean push(Object value) { return this.backing.add((T)value); }
/* 26 */   public final T pop() { return this.backing.remove(getSize() - 1); }
/* 27 */   public final T peek() { return this.backing.get(getSize() - 1); }
/* 28 */   public final T peek(int index) { return this.backing.get(index); }
/* 29 */   public final boolean isEmpty() { return this.backing.isEmpty(); }
/* 30 */   public final boolean isNotEmpty() { return !isEmpty(); }
/* 31 */   public final void clear() { this.backing.clear(); } @NotNull public final T[] toArray() { byte b; int i;
/*    */     Object[] arrayOfObject;
/* 33 */     for (b = 0, i = this.backing.size(), arrayOfObject = new Object[i]; b < i; ) { byte b1 = b; arrayOfObject[b1] = this.backing.get(b1); b++; }  return (T[])arrayOfObject; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\Stack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */