/*    */ package androidx.compose.runtime.saveable;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.jvm.internal.TypeIntrinsics;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0002\n\000\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\032}\020\000\032\016\022\004\022\002H\002\022\004\022\0020\0030\001\"\004\b\000\020\002\"\004\b\001\020\00422\020\005\032.\022\004\022\0020\007\022\023\022\021H\002¢\006\f\b\b\022\b\b\t\022\004\b\b(\n\022\n\022\b\022\004\022\002H\0040\0130\006¢\006\002\b\f2)\020\r\032%\022\031\022\027\022\004\022\002H\0040\013¢\006\f\b\b\022\b\b\t\022\004\b\b(\017\022\006\022\004\030\001H\0020\016¨\006\020"}, d2 = {"listSaver", "Landroidx/compose/runtime/saveable/Saver;", "Original", "", "Saveable", "save", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "", "Lkotlin/ExtensionFunctionType;", "restore", "Lkotlin/Function1;", "list", "runtime-saveable"})
/*    */ public final class ListSaverKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <Original, Saveable> Saver<Original, Object> listSaver(@NotNull Function2<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> save, @NotNull Function1 restore) {
/* 33 */     Intrinsics.checkNotNullParameter(save, "save"); Intrinsics.checkNotNullParameter(restore, "restore"); return SaverKt.Saver(new ListSaverKt$listSaver$1(save), 
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
/* 44 */         (Function1<? super Object, ? extends Original>)TypeIntrinsics.beforeCheckcastToFunctionOfArity(restore, 1)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\020\000\032\004\030\0010\001\"\004\b\000\020\002\"\004\b\001\020\003*\0020\0042\006\020\005\032\002H\002H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "Original", "Saveable", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;"}) @SourceDebugExtension({"SMAP\nListSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListSaver.kt\nandroidx/compose/runtime/saveable/ListSaverKt$listSaver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"}) static final class ListSaverKt$listSaver$1 extends Lambda implements Function2<SaverScope, Original, Object> { @Nullable public final Object invoke(@NotNull SaverScope $this$Saver, Object it) { Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver"); List<?> list = (List)this.$save.invoke($this$Saver, it); for (int index = 0, i = list.size(); index < i; index++) {
/*    */         Object item = list.get(index);
/*    */         if (item != null && !$this$Saver.canBeSaved(item)) {
/* 47 */           int $i$a$-require-ListSaverKt$listSaver$1$1 = 0;
/*    */           String str = "item can't be saved";
/*    */           throw new IllegalArgumentException(str.toString());
/*    */         } 
/*    */       } 
/*    */       return (!list.isEmpty()) ? new ArrayList(list) : null; }
/*    */ 
/*    */     
/*    */     ListSaverKt$listSaver$1(Function2<SaverScope, Original, List<Saveable>> $save) {
/*    */       super(2);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-saveable-desktop-1.7.3.jar!\androidx\compose\runtime\saveable\ListSaverKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */