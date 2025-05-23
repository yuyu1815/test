/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\002\b\003\b\002\030\000*\004\b\002\020\001*\004\b\003\020\0022\0020\003B\005¢\006\002\020\004R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R#\020\017\032\024\022\020\022\016\022\004\022\0028\002\022\004\022\0028\0030\0210\020¢\006\b\n\000\032\004\b\022\020\023¨\006\024"}, d2 = {"Lai/grazie/utils/SuspendableBatchProcessor$Buffer;", "T", "Result", "", "()V", "count", "", "getCount", "()I", "setCount", "(I)V", "id", "Lai/grazie/utils/mpp/UUID;", "getId", "()Lai/grazie/utils/mpp/UUID;", "items", "", "Lai/grazie/utils/SuspendableBatchProcessor$BufferItem;", "getItems", "()Ljava/util/List;", "utils-common"})
/*    */ final class Buffer<T, Result>
/*    */ {
/*    */   @NotNull
/* 40 */   private final UUID id = UUID.Companion.random(); @NotNull public final UUID getId() { return this.id; } @NotNull
/* 41 */   private final List<SuspendableBatchProcessor.BufferItem<T, Result>> items = new ArrayList<>(); @NotNull public final List<SuspendableBatchProcessor.BufferItem<T, Result>> getItems() { return this.items; } private int count; public final int getCount() {
/* 42 */     return this.count; } public final void setCount(int <set-?>) { this.count = <set-?>; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SuspendableBatchProcessor$Buffer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */