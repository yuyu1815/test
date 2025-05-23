package androidx.compose.ui.text.input;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "This function is not being used by any APIs. API is now deprecated and will be removed")
@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bg\030\0002\0020\001J\026\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\005H&J\032\020\007\032\0020\0032\006\020\b\032\0020\tH&ø\001\000¢\006\004\b\n\020\013ø\001\001\002\r\n\005\b¡\0360\001\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Landroidx/compose/ui/text/input/InputEventCallback;", "", "onEditCommands", "", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "onImeAction", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "onImeAction-KlQnJC8", "(I)V", "ui-text"})
public interface InputEventCallback {
  void onEditCommands(@NotNull List<? extends EditCommand> paramList);
  
  void onImeAction-KlQnJC8(int paramInt);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\InputEventCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */