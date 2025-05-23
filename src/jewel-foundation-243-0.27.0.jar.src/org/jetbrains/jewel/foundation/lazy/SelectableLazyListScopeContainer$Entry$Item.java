/*    */ package org.jetbrains.jewel.foundation.lazy;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B7\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\003\022\034\020\005\032\030\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¢\006\002\b\n¢\006\004\b\013\020\fJ\t\020\023\032\0020\003HÆ\003J\013\020\024\032\004\030\0010\003HÆ\003J$\020\025\032\030\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¢\006\002\b\nHÆ\003¢\006\002\020\021JD\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\036\b\002\020\005\032\030\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¢\006\002\b\nHÆ\001¢\006\002\020\027J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\003HÖ\003J\t\020\033\032\0020\034HÖ\001J\t\020\035\032\0020\036HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\017\020\016R)\020\005\032\030\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¢\006\002\b\n¢\006\n\n\002\020\022\032\004\b\020\020\021¨\006\037"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Item;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;", "key", "", "contentType", "content", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "getKey", "()Ljava/lang/Object;", "getContentType", "getContent", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Item;", "equals", "", "other", "hashCode", "", "toString", "", "foundation"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class Item
/*    */   implements SelectableLazyListScopeContainer.Entry
/*    */ {
/*    */   @NotNull
/*    */   private final Object key;
/*    */   @Nullable
/*    */   private final Object contentType;
/*    */   @NotNull
/*    */   private final Function3<SelectableLazyItemScope, Composer, Integer, Unit> content;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public Item(@NotNull Object key, @Nullable Object contentType, @NotNull Function3<SelectableLazyItemScope, Composer, Integer, Unit> content) {
/* 81 */     this.key = key;
/* 82 */     this.contentType = contentType;
/* 83 */     this.content = content; } @NotNull public final Function3<SelectableLazyItemScope, Composer, Integer, Unit> getContent() { return this.content; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Object getKey() {
/*    */     return this.key;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object getContentType() {
/*    */     return this.contentType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Object component1() {
/*    */     return this.key;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object component2() {
/*    */     return this.contentType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function3<SelectableLazyItemScope, Composer, Integer, Unit> component3() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Item copy(@NotNull Object key, @Nullable Object contentType, @NotNull Function3<? super SelectableLazyItemScope, ? super Composer, ? super Integer, Unit> content) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new Item(key, contentType, content);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Item(key=" + this.key + ", contentType=" + this.contentType + ", content=" + this.content + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.key.hashCode();
/*    */     result = result * 31 + ((this.contentType == null) ? 0 : this.contentType.hashCode());
/*    */     return result * 31 + this.content.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Item))
/*    */       return false; 
/*    */     Item item = (Item)other;
/*    */     return !Intrinsics.areEqual(this.key, item.key) ? false : (!Intrinsics.areEqual(this.contentType, item.contentType) ? false : (!!Intrinsics.areEqual(this.content, item.content)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyListScopeContainer$Entry$Item.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */