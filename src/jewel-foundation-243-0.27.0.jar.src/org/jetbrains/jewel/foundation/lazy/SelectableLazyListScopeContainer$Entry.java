/*    */ package org.jetbrains.jewel.foundation.lazy;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.functions.Function4;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bp\030\0002\0020\001:\003\002\003\004\001\003\005\006\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;", "", "Item", "Items", "StickyHeader", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Item;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$StickyHeader;", "foundation"})
/*    */ public interface Entry
/*    */ {
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B7\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\003\022\034\020\005\032\030\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¢\006\002\b\n¢\006\004\b\013\020\fJ\t\020\023\032\0020\003HÆ\003J\013\020\024\032\004\030\0010\003HÆ\003J$\020\025\032\030\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¢\006\002\b\nHÆ\003¢\006\002\020\021JD\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\036\b\002\020\005\032\030\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¢\006\002\b\nHÆ\001¢\006\002\020\027J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\003HÖ\003J\t\020\033\032\0020\034HÖ\001J\t\020\035\032\0020\036HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\017\020\016R)\020\005\032\030\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¢\006\002\b\n¢\006\n\n\002\020\022\032\004\b\020\020\021¨\006\037"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Item;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;", "key", "", "contentType", "content", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "getKey", "()Ljava/lang/Object;", "getContentType", "getContent", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Item;", "equals", "", "other", "hashCode", "", "toString", "", "foundation"})
/*    */   @StabilityInferred(parameters = 0)
/*    */   public static final class Item
/*    */     implements Entry
/*    */   {
/*    */     @NotNull
/*    */     private final Object key;
/*    */     @Nullable
/*    */     private final Object contentType;
/*    */     @NotNull
/*    */     private final Function3<SelectableLazyItemScope, Composer, Integer, Unit> content;
/*    */     public static final int $stable = 8;
/*    */     
/*    */     public Item(@NotNull Object key, @Nullable Object contentType, @NotNull Function3<SelectableLazyItemScope, Composer, Integer, Unit> content) {
/* 81 */       this.key = key;
/* 82 */       this.contentType = contentType;
/* 83 */       this.content = content; } @NotNull public final Object getKey() { return this.key; } @Nullable public final Object getContentType() { return this.contentType; } @NotNull public final Function3<SelectableLazyItemScope, Composer, Integer, Unit> getContent() { return this.content; } @NotNull public final Object component1() { return this.key; } @Nullable public final Object component2() { return this.contentType; } @NotNull public final Function3<SelectableLazyItemScope, Composer, Integer, Unit> component3() { return this.content; } @NotNull public final Item copy(@NotNull Object key, @Nullable Object contentType, @NotNull Function3<? super SelectableLazyItemScope, ? super Composer, ? super Integer, Unit> content) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(content, "content"); return new Item(key, contentType, content); } @NotNull public String toString() { return "Item(key=" + this.key + ", contentType=" + this.contentType + ", content=" + this.content + ")"; }
/*    */     public int hashCode() { result = this.key.hashCode(); result = result * 31 + ((this.contentType == null) ? 0 : this.contentType.hashCode()); return result * 31 + this.content.hashCode(); }
/*    */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Item)) return false;  Item item = (Item)other; return !Intrinsics.areEqual(this.key, item.key) ? false : (!Intrinsics.areEqual(this.contentType, item.contentType) ? false : (!!Intrinsics.areEqual(this.content, item.content))); } }
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\030\002\n\002\b\021\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\001\022\006\020\002\032\0020\003\022!\020\004\032\035\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\t0\005\022#\020\n\032\037\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\006\022\004\030\0010\t0\005\0221\020\013\032-\022\004\022\0020\r\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\0160\f¢\006\002\b\017¢\006\002\b\020¢\006\004\b\021\020\022J\t\020\033\032\0020\003HÆ\003J$\020\034\032\035\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\t0\005HÆ\003J&\020\035\032\037\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\006\022\004\030\0010\t0\005HÆ\003J9\020\036\032-\022\004\022\0020\r\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\0160\f¢\006\002\b\017¢\006\002\b\020HÆ\003¢\006\002\020\031J\001\020\037\032\0020\0002\b\b\002\020\002\032\0020\0032#\b\002\020\004\032\035\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\t0\0052%\b\002\020\n\032\037\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\006\022\004\030\0010\t0\00523\b\002\020\013\032-\022\004\022\0020\r\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\0160\f¢\006\002\b\017¢\006\002\b\020HÆ\001¢\006\002\020 J\023\020!\032\0020\"2\b\020#\032\004\030\0010\tHÖ\003J\t\020$\032\0020\003HÖ\001J\t\020%\032\0020&HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\023\020\024R,\020\004\032\035\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\t0\005¢\006\b\n\000\032\004\b\025\020\026R.\020\n\032\037\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\006\022\004\030\0010\t0\005¢\006\b\n\000\032\004\b\027\020\026R>\020\013\032-\022\004\022\0020\r\022\023\022\0210\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\0160\f¢\006\002\b\017¢\006\002\b\020¢\006\n\n\002\020\032\032\004\b\030\020\031¨\006'"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;", "count", "", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "contentType", "itemContent", "Lkotlin/Function2;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "getCount", "()I", "getKey", "()Lkotlin/jvm/functions/Function1;", "getContentType", "getItemContent", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/jvm/functions/Function4;", "component1", "component2", "component3", "component4", "copy", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items;", "equals", "", "other", "hashCode", "toString", "", "foundation"}) @StabilityInferred(parameters = 1) public static final class Items implements Entry { private final int count; @NotNull private final Function1<Integer, Object> key; @NotNull private final Function1<Integer, Object> contentType; @NotNull private final Function4<SelectableLazyItemScope, Integer, Composer, Integer, Unit> itemContent; public static final int $stable;
/* 87 */     public Items(int count, @NotNull Function1<Integer, Object> key, @NotNull Function1<Integer, Object> contentType, @NotNull Function4<SelectableLazyItemScope, Integer, Composer, Integer, Unit> itemContent) { this.count = count;
/* 88 */       this.key = key;
/* 89 */       this.contentType = contentType;
/* 90 */       this.itemContent = itemContent; } public final int getCount() { return this.count; } @NotNull public final Function1<Integer, Object> getKey() { return this.key; } @NotNull public final Function1<Integer, Object> getContentType() { return this.contentType; } @NotNull public final Function4<SelectableLazyItemScope, Integer, Composer, Integer, Unit> getItemContent() { return this.itemContent; }
/*    */     public final int component1() { return this.count; } @NotNull public final Function1<Integer, Object> component2() { return this.key; } @NotNull public final Function1<Integer, Object> component3() { return this.contentType; } @NotNull public final Function4<SelectableLazyItemScope, Integer, Composer, Integer, Unit> component4() { return this.itemContent; } @NotNull public final Items copy(int count, @NotNull Function1<? super Integer, ? extends Object> key, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super SelectableLazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(contentType, "contentType"); Intrinsics.checkNotNullParameter(itemContent, "itemContent"); return new Items(count, key, contentType, itemContent); } @NotNull public String toString() { return "Items(count=" + this.count + ", key=" + this.key + ", contentType=" + this.contentType + ", itemContent=" + this.itemContent + ")"; } public int hashCode() { result = Integer.hashCode(this.count); result = result * 31 + this.key.hashCode(); result = result * 31 + this.contentType.hashCode(); return result * 31 + this.itemContent.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Items)) return false;  Items items = (Items)other; return (this.count != items.count) ? false : (!Intrinsics.areEqual(this.key, items.key) ? false : (!Intrinsics.areEqual(this.contentType, items.contentType) ? false : (!!Intrinsics.areEqual(this.itemContent, items.itemContent)))); } }
/*    */    @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B7\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\003\022\034\020\005\032\030\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¢\006\002\b\n¢\006\004\b\013\020\fJ\t\020\023\032\0020\003HÆ\003J\013\020\024\032\004\030\0010\003HÆ\003J$\020\025\032\030\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¢\006\002\b\nHÆ\003¢\006\002\020\021JD\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\036\b\002\020\005\032\030\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¢\006\002\b\nHÆ\001¢\006\002\020\027J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\003HÖ\003J\t\020\033\032\0020\034HÖ\001J\t\020\035\032\0020\036HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\017\020\016R)\020\005\032\030\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¢\006\002\b\n¢\006\n\n\002\020\022\032\004\b\020\020\021¨\006\037"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$StickyHeader;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;", "key", "", "contentType", "content", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "getKey", "()Ljava/lang/Object;", "getContentType", "getContent", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$StickyHeader;", "equals", "", "other", "hashCode", "", "toString", "", "foundation"}) @StabilityInferred(parameters = 0) public static final class StickyHeader implements Entry
/*    */   {
/* 94 */     @NotNull private final Object key; @Nullable private final Object contentType; public StickyHeader(@NotNull Object key, @Nullable Object contentType, @NotNull Function3<SelectableLazyItemScope, Composer, Integer, Unit> content) { this.key = key;
/* 95 */       this.contentType = contentType;
/* 96 */       this.content = content; } @NotNull private final Function3<SelectableLazyItemScope, Composer, Integer, Unit> content; public static final int $stable = 8; @NotNull public final Object getKey() { return this.key; } @Nullable public final Object getContentType() { return this.contentType; } @NotNull public final Function3<SelectableLazyItemScope, Composer, Integer, Unit> getContent() { return this.content; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final Object component1() {
/*    */       return this.key;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object component2() {
/*    */       return this.contentType;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Function3<SelectableLazyItemScope, Composer, Integer, Unit> component3() {
/*    */       return this.content;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final StickyHeader copy(@NotNull Object key, @Nullable Object contentType, @NotNull Function3<? super SelectableLazyItemScope, ? super Composer, ? super Integer, Unit> content) {
/*    */       Intrinsics.checkNotNullParameter(key, "key");
/*    */       Intrinsics.checkNotNullParameter(content, "content");
/*    */       return new StickyHeader(key, contentType, content);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "StickyHeader(key=" + this.key + ", contentType=" + this.contentType + ", content=" + this.content + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.key.hashCode();
/*    */       result = result * 31 + ((this.contentType == null) ? 0 : this.contentType.hashCode());
/*    */       return result * 31 + this.content.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof StickyHeader))
/*    */         return false; 
/*    */       StickyHeader stickyHeader = (StickyHeader)other;
/*    */       return !Intrinsics.areEqual(this.key, stickyHeader.key) ? false : (!Intrinsics.areEqual(this.contentType, stickyHeader.contentType) ? false : (!!Intrinsics.areEqual(this.content, stickyHeader.content)));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyListScopeContainer$Entry.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */